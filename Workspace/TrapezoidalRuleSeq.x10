public class Hello {

	static def f(x: Double) : Double {
		return x*x*x;
	}
	
	static def distTrap (a: Double, b: Double, N: Int, nThread: Int) : Double {
		val refToRes = new GlobalRef[Cell[Double]](new Cell[Double](0));
		finish {
			for(p in Place.places()) async{
				var h: Double = (b - a) / N; // step size
				var ln:Long = N / Place.numPlaces();
				var la:Double = a + p.id * ln * h;
				var lb:Double = la + ln*h;
				var sum: Double = 0.5 * (f(la) + f(lb));    // area
				var res:Double= 0.0;
				finish {
					val quotient: Long = ln / nThread;
					val residue: Long = ln % nThread;
					for(tid in 0..(nThread - 1)) async{
						var local_la:Long = tid * quotient;
						var local_lb:Long = local_la + quotient - 1;
						if(tid < residue && residue != 0){
							local_la = tid*(quotient + 1);
							local_lb = local_la + ln;
						}else{
							local_la = tid*(quotient + 1);
							local_lb = local_la + quotient - 1;
						}
						for (var i:Long = local_la; i < local_lb; i++) {
							var x: Double = la + h * i;
							sum = sum + f(x);
						}
						atomic res += sum * h;
					}
				}
				//atomic res += sum * h;
				at(refToRes) refToRes()() += res;
			} //async
		} //finish
		return refToRes()();
	}
	
	public static def main(args:Rail[String]){
		//Parallel code by tasks
		var ti:Long = System.currentTimeMillis();
		var a:Double = 0;
		var b:Double = 10;
		var nTrap: Int = 1000000000n;
		var nThread: Int = 2n;
		var refToRes:Double = distTrap(a, b, nTrap, nThread);
		var tf:Long = System.currentTimeMillis();
		Console.OUT.println("Trap tasks Res = "+refToRes+" in "+(tf-ti)+" ms");	
	}
}

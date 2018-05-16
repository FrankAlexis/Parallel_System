public class Hello {

	static def f(x: Double) : Double {
		return x*x*x;
	}
	
	static def trap(a: Double, b: Double, N: Long) : Double {
		var h: Double = (b - a) / N;              // step size
		var sum: Double = 0.5 * (f(a) + f(b));    // area
		for (var i:Int = 1n; i < N; i++) {
			var x: Double = a + h * i;
			sum = sum + f(x);
		}
		return sum * h;
	}

	static def taskTrap (a: Long, b: Long, N: Long, nTasks:Int) : Double {
		var res:Double= 0.0;
		finish {
			for(tid in 0..(nTasks-1)) async{
				var h: Double = (b - a) / N; // step size
				var ln:Long = N / nTasks;
				var la:Double = a + tid * ln * h;
				var lb:Double = la + ln*h;
				var sum: Double = 0.5 * (f(la) + f(lb));    // area
				for (var i:Int = 1n; i < ln; i++) {
					var x: Double = la + h * i;
					sum = sum + f(x);
				}
				atomic res += sum * h;
			} //async
		} //finish
		return res;
	}
	
	static def distTrap (a: Double, b: Double, N: Int) : Double {
		val refToRes = new GlobalRef[Cell[Double]](new Cell[Double](0));
		finish {
			for(p in Place.places()) async{
				var h: Double = (b - a) / N; // step size
				var ln:Long = N / Place.numPlaces();
				var la:Double = a + p.id * ln * h;
				var lb:Double = la + ln*h;
				var sum: Double = 0.5 * (f(la) + f(lb));    // area
				for (var i:Int = 1n; i < ln; i++) {
					var x: Double = la + h * i;
					sum = sum + f(x);
				}
				val partial = sum * h;
				//atomic res += sum * h;
				at(refToRes) refToRes()() += partial;
			} //async
		} //finish
		return refToRes()();
	}
	
	public static def main(args:Rail[String]){
		//Parallel code by tasks
		var ti:Long = System.currentTimeMillis();
		val refToRes = new GlobalRef[Cell[Double]](new Cell[Double](0));
		var a:Long = 0;
		var b:Long = 10;
		var nTrap: Long = 1000000000;
		var nThread: Int = 8n;
		finish {
			for(p in Place.places()) async{
				var local_n:Long = (b-a)/Place.numPlaces();
				var residuo: Long = (b-a)%Place.numPlaces();
				if(residuo != 0 ){
					if(p.id < residuo){
						a = p.id*(local_n + 1);
						b = a + local_n;
					}else{
						a = p.id*(local_n + 1);
						b = a + local_n - 1;
					}
				}else{
					a = p.id * local_n;
					b = a + local_n - 1;
				}
				Console.OUT.println("a:"+a+", b:"+b);
				val partial = taskTrap(a, b, nTrap, nThread);
				Console.OUT.println("Partial:"+partial);
				at(refToRes) refToRes()() += partial;
			}
		}
		var tf:Long = System.currentTimeMillis();
		Console.OUT.println("Trap tasks Res = "+refToRes()()+" in "+(tf-ti)+" ms");	
	}
}

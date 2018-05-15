/**
 * The canonical "Hello, World" demo class expressed in X10
 */
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

		static def sharedTrap (a: Double, b: Double, N: Long, nTasks:Int) : Double {
			var res:Double = 0.0;
			finish for (tid in 0..(nTasks -1)) async{
					var h: Double = (b - a) / N;
					var local_n:Long = N / nTasks;
					var local_a:Double = a + tid*h*local_n;
					var local_b:Double = local_a + local_n*h;
					var sum: Double = 0.5 * (f(local_a) + f(local_b));    // area
					for (var i:Int = 1n; i < local_n; i++) {
						var x: Double = local_a + h * i;
						sum = sum + f(x);
					}
					atomic res += sum*h;
				}
			return res;
		}
		
		static def distTrap (a: Double, b: Double, N: Int) : Double {
			return 0.0;
		}
		
		static def reduceTrap (a: Double, b: Double, N: Long, nTasks:Int) : Double {
			val result = finish(Reducible.SumReducer[Double]()){ 
				for (tid in 0..(nTasks -1)) async{
					var h: Double = (b - a) / N;
					var local_n:Long = N / nTasks;
					var local_a:Double = a + tid*h*local_n;
					var local_b:Double = local_a + local_n*h;
					var sum: Double = 0.5 * (f(local_a) + f(local_b));    // area
					for (var i:Int = 1n; i < local_n; i++) {
						var x: Double = local_a + h * i;
						sum = sum + f(x);
					}
					offer sum*h;
				}
			};
			return result;
		}
    /**
     * The main method for the Hello class
     */
    public static def main(Rail[String]) {
    	val time_1 = System.currentTimeMillis();
        var res:Double = reduceTrap(0, 10, 1000000000, 8n);
        val time_2 = System.currentTimeMillis();
        Console.OUT.println("Time(ms):"+(time_2 - time_1) +" ,Res:"+res);
    }

}
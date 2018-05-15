/**
 * The canonical "Hello, World" demo class expressed in X10
 */
public class Hello {
	
	private val n:Long;
	public def this(n:Long){ this.n = n;}
	public def test() = this.n > 0;
	
    /**
     * The main method for the Hello class
     */
    public static def main(args:Rail[String]) {
    	
    	val foo = new Hello(args.size);
    	val result = foo.test();
    	if(result)
        Console.OUT.println("Argumento:"+args(0));
    }

}
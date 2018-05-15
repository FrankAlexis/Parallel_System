/**
 * The canonical "Hello, World" demo class expressed in X10
 */
@x10.runtime.impl.java.X10Generated
public class Hello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Hello> $RTT = 
        x10.rtt.NamedType.<Hello> make("Hello",
                                       Hello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        $_obj.n = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.n);
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 6 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    public long n;
    
    
    //#line 7 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello(final long n) {
        this((java.lang.System[]) null);
        Hello$$init$S(n);
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S(final long n) {
         {
            
            //#line 7 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            
            
            //#line 4 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            this.__fieldInitializers_Hello();
            
            //#line 7 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            this.n = n;
        }
        return this;
    }
    
    
    
    //#line 8 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    public boolean test$O() {
        
        //#line 8 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        final long t$465 = this.n;
        
        //#line 8 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        final boolean t$466 = ((t$465) > (((long)(0L))));
        
        //#line 8 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        return t$466;
    }
    
    
    //#line 13 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    /**
     * The main method for the Hello class
     */
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Hello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 15 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        final long t$467 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 15 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        final Hello foo = ((Hello)(new Hello((java.lang.System[]) null).Hello$$init$S(((long)(t$467)))));
        
        //#line 16 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        final boolean result = foo.test$O();
        
        //#line 17 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        if (result) {
            
            //#line 18 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            final x10.io.Printer t$469 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
            //#line 18 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            final java.lang.String t$468 = ((java.lang.String[])args.value)[(int)0L];
            
            //#line 18 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            final java.lang.String t$470 = (("Argumento:") + (t$468));
            
            //#line 18 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
            t$469.println(((java.lang.Object)(t$470)));
        }
    }
    
    
    //#line 4 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 4 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 4 "/home/frank/Desktop/Workspace/HelloWorld/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
}


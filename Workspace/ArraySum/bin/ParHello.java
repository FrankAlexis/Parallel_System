@x10.runtime.impl.java.X10Generated
public class ParHello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ParHello> $RTT = 
        x10.rtt.NamedType.<ParHello> make("ParHello",
                                          ParHello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ParHello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ParHello.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ParHello $_obj = new ParHello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public ParHello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 3 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    public static double f$O(final double x) {
        
        //#line 4 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154321 = ((x) * (((double)(x))));
        
        //#line 4 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154322 = ((t$154321) * (((double)(x))));
        
        //#line 4 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        return t$154322;
    }
    
    
    //#line 7 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    public static double trap$O(final double a, final double b, final long N) {
        
        //#line 8 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154323 = ((b) - (((double)(a))));
        
        //#line 8 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154324 = ((double)(long)(((long)(N))));
        
        //#line 8 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        double h = ((t$154323) / (((double)(t$154324))));
        
        //#line 9 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154325 = ParHello.f$O((double)(a));
        
        //#line 9 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154326 = ParHello.f$O((double)(b));
        
        //#line 9 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154327 = ((t$154325) + (((double)(t$154326))));
        
        //#line 9 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        double sum = ((0.5) * (((double)(t$154327))));
        
        //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        int i$154525 = 1;
        
        //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        for (;
             true;
             ) {
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final int t$154526 = i$154525;
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final long t$154527 = ((long)(((int)(t$154526))));
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final boolean t$154528 = ((t$154527) < (((long)(N))));
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            if (!(t$154528)) {
                
                //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                break;
            }
            
            //#line 11 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154514 = h;
            
            //#line 11 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final int t$154515 = i$154525;
            
            //#line 11 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154516 = ((double)(int)(((int)(t$154515))));
            
            //#line 11 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154517 = ((t$154514) * (((double)(t$154516))));
            
            //#line 11 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            double x$154518 = ((a) + (((double)(t$154517))));
            
            //#line 12 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154519 = sum;
            
            //#line 12 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154520 = x$154518;
            
            //#line 12 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154521 = ParHello.f$O((double)(t$154520));
            
            //#line 12 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final double t$154522 = ((t$154519) + (((double)(t$154521))));
            
            //#line 12 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            sum = t$154522;
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final int t$154523 = i$154525;
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final int t$154524 = ((t$154523) + (((int)(1))));
            
            //#line 10 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            i$154525 = t$154524;
        }
        
        //#line 14 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154360 = sum;
        
        //#line 14 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154361 = h;
        
        //#line 14 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154362 = ((t$154360) * (((double)(t$154361))));
        
        //#line 14 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        return t$154362;
    }
    
    
    //#line 17 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    public static double taskTrap$O(final double a, final double b, final long N, final int nTasks) {
        
        //#line 18 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        double res = 0.0;
        {
            
            //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final x10.xrx.FinishState fs$155110 = x10.xrx.Runtime.startFinish();
            {
                
                //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double[] $res$155122 = new double[1];
                
                //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                $res$155122[(int)0]=res;
                
                //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                try {{
                    {
                        
                        //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final long i$154086min$154087 = 0L;
                        
                        //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final long t$154363 = ((long)(((int)(nTasks))));
                        
                        //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final long i$154086max$154088 = ((t$154363) - (((long)(1L))));
                        
                        //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        long i$154577 = i$154086min$154087;
                        
                        //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            final long t$154578 = i$154577;
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            final boolean t$154579 = ((t$154578) <= (((long)(i$154086max$154088))));
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            if (!(t$154579)) {
                                
                                //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                                break;
                            }
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            final long tid$154574 = i$154577;
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ParHello.$Closure$12(b, a, N, nTasks, tid$154574, $res$155122))));
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            final long t$154575 = i$154577;
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            final long t$154576 = ((t$154575) + (((long)(1L))));
                            
                            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            i$154577 = t$154576;
                        }
                    }
                }}catch (java.lang.Throwable ct$154634) {
                    
                    //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$154634)));
                    
                    //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                     x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$155110)));
                 }}
                
                //#line 19 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                res = ((double)$res$155122[(int)0]);
                }
            }
        
        //#line 34 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154443 = res;
        
        //#line 34 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        return t$154443;
        }
    
    
    //#line 37 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    public static x10.core.GlobalRef distTrap(final double a, final double b, final int N) {
        
        //#line 38 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154444 = ((double)(long)(((long)(0L))));
        
        //#line 38 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final x10.lang.Cell t$154445 = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Double>((java.lang.System[]) null, x10.rtt.Types.DOUBLE).x10$lang$Cell$$init$S(x10.core.Double.$box(t$154444), (x10.lang.Cell.__0x10$lang$Cell$$T) null)));
        
        //#line 38 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final x10.core.GlobalRef refToRes = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.DOUBLE), ((x10.lang.Cell<x10.core.Double>)(t$154445)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        {
            
            //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            x10.xrx.Runtime.ensureNotInAtomic();
            
            //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            final x10.xrx.FinishState fs$155120 = x10.xrx.Runtime.startFinish();
            
            //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            try {{
                {
                    
                    //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final x10.lang.PlaceGroup t$154447 = ((x10.lang.PlaceGroup)(x10.lang.Place.places()));
                    
                    //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final x10.lang.Iterator p$154251 = ((x10.lang.Iterable<x10.lang.Place>)t$154447).iterator();
                    
                    //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final boolean t$154488 = ((x10.lang.Iterator<x10.lang.Place>)p$154251).hasNext$O();
                        
                        //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        if (!(t$154488)) {
                            
                            //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                            break;
                        }
                        
                        //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final x10.lang.Place p$154597 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$154251).next$G()));
                        
                        //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        x10.xrx.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ParHello.$Closure$14(b, a, N, p$154597, refToRes, (ParHello.$Closure$14.__4$1x10$lang$Cell$1x10$lang$Double$2$2) null))));
                    }
                }
            }}catch (java.lang.Throwable ct$155118) {
                
                //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                x10.xrx.Runtime.pushException(((java.lang.Throwable)(ct$155118)));
                
                //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 39 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                 x10.xrx.Runtime.stopFinish(((x10.xrx.FinishState)(fs$155120)));
             }}
            }
        
        //#line 55 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        return refToRes;
        }
    
    
    //#line 58 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
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
            ParHello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 59 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        long ti = x10.lang.System.currentTimeMillis$O();
        
        //#line 60 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154489 = ((double)(long)(((long)(0L))));
        
        //#line 60 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154490 = ((double)(long)(((long)(10L))));
        
        //#line 60 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        double res = ParHello.trap$O((double)(t$154489), (double)(t$154490), (long)(1000000000L));
        
        //#line 61 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        long tf = x10.lang.System.currentTimeMillis$O();
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final x10.io.Printer t$154498 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154491 = res;
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154492 = (("Trap seq Res = ") + ((x10.core.Double.$box(t$154491))));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154495 = ((t$154492) + (" in "));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154493 = tf;
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154494 = ti;
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154496 = ((t$154493) - (((long)(t$154494))));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154497 = ((t$154495) + ((x10.core.Long.$box(t$154496))));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154499 = ((t$154497) + (" ms"));
        
        //#line 62 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        t$154498.println(((java.lang.Object)(t$154499)));
        
        //#line 65 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154500 = x10.lang.System.currentTimeMillis$O();
        
        //#line 65 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        ti = t$154500;
        
        //#line 66 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154501 = ((double)(long)(((long)(0L))));
        
        //#line 66 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154502 = ((double)(long)(((long)(10L))));
        
        //#line 66 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154503 = ParHello.taskTrap$O((double)(t$154501), (double)(t$154502), (long)(1000000000L), (int)(8));
        
        //#line 66 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        res = t$154503;
        
        //#line 67 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154504 = x10.lang.System.currentTimeMillis$O();
        
        //#line 67 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        tf = t$154504;
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final x10.io.Printer t$154512 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final double t$154505 = res;
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154506 = (("Trap tasks Res = ") + ((x10.core.Double.$box(t$154505))));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154509 = ((t$154506) + (" in "));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154507 = tf;
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154508 = ti;
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final long t$154510 = ((t$154507) - (((long)(t$154508))));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154511 = ((t$154509) + ((x10.core.Long.$box(t$154510))));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        final java.lang.String t$154513 = ((t$154511) + (" ms"));
        
        //#line 68 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        t$154512.println(((java.lang.Object)(t$154513)));
    }
    
    
    //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    final public ParHello ParHello$$this$ParHello() {
        
        //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
        return ParHello.this;
    }
    
    
    //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    // creation method for java code (1-phase java constructor)
    public ParHello() {
        this((java.lang.System[]) null);
        ParHello$$init$S();
    }
    
    // constructor for non-virtual call
    final public ParHello ParHello$$init$S() {
         {
            
            //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            
            
            //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            this.__fieldInitializers_ParHello();
        }
        return this;
    }
    
    
    
    //#line 1 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
    final public void __fieldInitializers_ParHello() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$12 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$12> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$12> make($Closure$12.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ParHello.$Closure$12 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$12.class + " calling"); } 
            $_obj.$res$155122 = $deserializer.readObject();
            $_obj.N = $deserializer.readLong();
            $_obj.a = $deserializer.readDouble();
            $_obj.b = $deserializer.readDouble();
            $_obj.nTasks = $deserializer.readInt();
            $_obj.tid$154574 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ParHello.$Closure$12 $_obj = new ParHello.$Closure$12((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$res$155122);
            $serializer.write(this.N);
            $serializer.write(this.a);
            $serializer.write(this.b);
            $serializer.write(this.nTasks);
            $serializer.write(this.tid$154574);
            
        }
        
        // constructor just for allocation
        public $Closure$12(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            try {{
                
                //#line 21 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154546 = ((this.b) - (((double)(this.a))));
                
                //#line 21 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154547 = ((double)(long)(((long)(this.N))));
                
                //#line 21 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double h$154548 = ((t$154546) / (((double)(t$154547))));
                
                //#line 22 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154549 = ((long)(((int)(this.nTasks))));
                
                //#line 22 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                long ln$154550 = ((this.N) / (((long)(t$154549))));
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154551 = ln$154550;
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154552 = ((this.tid$154574) * (((long)(t$154551))));
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154553 = ((double)(long)(((long)(t$154552))));
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154554 = h$154548;
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154555 = ((t$154553) * (((double)(t$154554))));
                
                //#line 23 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double la$154556 = ((this.a) + (((double)(t$154555))));
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154557 = la$154556;
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154558 = ln$154550;
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154559 = ((double)(long)(((long)(t$154558))));
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154560 = h$154548;
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154561 = ((t$154559) * (((double)(t$154560))));
                
                //#line 24 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double lb$154562 = ((t$154557) + (((double)(t$154561))));
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154563 = la$154556;
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154564 = ParHello.f$O((double)(t$154563));
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154565 = lb$154562;
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154566 = ParHello.f$O((double)(t$154565));
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154567 = ((t$154564) + (((double)(t$154566))));
                
                //#line 25 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double sum$154568 = ((0.5) * (((double)(t$154567))));
                
                //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                int i$154541 = 1;
                
                //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154542 = i$154541;
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final long t$154543 = ((long)(((int)(t$154542))));
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final long t$154544 = ln$154550;
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final boolean t$154545 = ((t$154543) < (((long)(t$154544))));
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    if (!(t$154545)) {
                        
                        //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        break;
                    }
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154529 = la$154556;
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154530 = h$154548;
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154531 = i$154541;
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154532 = ((double)(int)(((int)(t$154531))));
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154533 = ((t$154530) * (((double)(t$154532))));
                    
                    //#line 27 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    double x$154534 = ((t$154529) + (((double)(t$154533))));
                    
                    //#line 28 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154535 = sum$154568;
                    
                    //#line 28 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154536 = x$154534;
                    
                    //#line 28 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154537 = ParHello.f$O((double)(t$154536));
                    
                    //#line 28 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154538 = ((t$154535) + (((double)(t$154537))));
                    
                    //#line 28 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    sum$154568 = t$154538;
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154539 = i$154541;
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154540 = ((t$154539) + (((int)(1))));
                    
                    //#line 26 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    i$154541 = t$154540;
                }
                
                //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                try {{
                    
                    //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    x10.xrx.Runtime.enterAtomic();
                    {
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final double t$154569 = ((double)this.$res$155122[(int)0]);
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final double t$154570 = sum$154568;
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final double t$154571 = h$154548;
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final double t$154572 = ((t$154570) * (((double)(t$154571))));
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        final double t$154573 = ((t$154569) + (((double)(t$154572))));
                        
                        //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        this.$res$155122[(int)0]=t$154573;
                    }
                }}finally {{
                      
                      //#line 31 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                      x10.xrx.Runtime.exitAtomic();
                  }}
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 20 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
        
        public double b;
        public double a;
        public long N;
        public int nTasks;
        public long tid$154574;
        public double[] $res$155122;
        
        public $Closure$12(final double b, final double a, final long N, final int nTasks, final long tid$154574, final double[] $res$155122) {
             {
                this.b = b;
                this.a = a;
                this.N = N;
                this.nTasks = nTasks;
                this.tid$154574 = tid$154574;
                this.$res$155122 = $res$155122;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$13 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$13> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$13> make($Closure$13.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ParHello.$Closure$13 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$13.class + " calling"); } 
            $_obj.partial$154625 = $deserializer.readDouble();
            $_obj.refToRes = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ParHello.$Closure$13 $_obj = new ParHello.$Closure$13((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.partial$154625);
            $serializer.write(this.refToRes);
            
        }
        
        // constructor just for allocation
        public $Closure$13(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            try {{
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final x10.lang.Cell a$154627 = (((x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>)(this.refToRes))).$apply$G();
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154628 = x10.core.Double.$unbox(((x10.lang.Cell<x10.core.Double>)a$154627).$apply$G());
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double r$154629 = ((t$154628) + (((double)(this.partial$154625))));
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                ((x10.lang.Cell<x10.core.Double>)a$154627).$set__0x10$lang$Cell$$T(x10.core.Double.$box(r$154629));
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                int __lowerer__var__1__ = (x10.core.Int.$unbox(x10.xrx.Runtime.<x10.core.Int> wrapAtChecked$G(x10.rtt.Types.INT, ((java.lang.Throwable)(__lowerer__var__0__)))));
            }
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> refToRes;
        public double partial$154625;
        
        public $Closure$13(final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> refToRes, final double partial$154625, __0$1x10$lang$Cell$1x10$lang$Double$2$2 $dummy) {
             {
                this.refToRes = ((x10.core.GlobalRef)(refToRes));
                this.partial$154625 = partial$154625;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$14 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$14> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$14> make($Closure$14.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ParHello.$Closure$14 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$14.class + " calling"); } 
            $_obj.N = $deserializer.readInt();
            $_obj.a = $deserializer.readDouble();
            $_obj.b = $deserializer.readDouble();
            $_obj.p$154597 = $deserializer.readObject();
            $_obj.refToRes = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ParHello.$Closure$14 $_obj = new ParHello.$Closure$14((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.N);
            $serializer.write(this.a);
            $serializer.write(this.b);
            $serializer.write(this.p$154597);
            $serializer.write(this.refToRes);
            
        }
        
        // constructor just for allocation
        public $Closure$14(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __4$1x10$lang$Cell$1x10$lang$Double$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
            try {{
                
                //#line 41 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154598 = ((this.b) - (((double)(this.a))));
                
                //#line 41 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154599 = ((double)(int)(((int)(this.N))));
                
                //#line 41 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double h$154600 = ((t$154598) / (((double)(t$154599))));
                
                //#line 42 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154601 = ((long)(((int)(this.N))));
                
                //#line 42 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154602 = ((long)x10.x10rt.X10RT.numPlaces());
                
                //#line 42 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                long ln$154603 = ((t$154601) / (((long)(t$154602))));
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154604 = this.p$154597.id;
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154605 = ln$154603;
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154606 = ((t$154604) * (((long)(t$154605))));
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154607 = ((double)(long)(((long)(t$154606))));
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154608 = h$154600;
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154609 = ((t$154607) * (((double)(t$154608))));
                
                //#line 43 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double la$154610 = ((this.a) + (((double)(t$154609))));
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154611 = la$154610;
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final long t$154612 = ln$154603;
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154613 = ((double)(long)(((long)(t$154612))));
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154614 = h$154600;
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154615 = ((t$154613) * (((double)(t$154614))));
                
                //#line 44 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double lb$154616 = ((t$154611) + (((double)(t$154615))));
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154617 = la$154610;
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154618 = ParHello.f$O((double)(t$154617));
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154619 = lb$154616;
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154620 = ParHello.f$O((double)(t$154619));
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154621 = ((t$154618) + (((double)(t$154620))));
                
                //#line 45 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                double sum$154622 = ((0.5) * (((double)(t$154621))));
                
                //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                int i$154592 = 1;
                
                //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154593 = i$154592;
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final long t$154594 = ((long)(((int)(t$154593))));
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final long t$154595 = ln$154603;
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final boolean t$154596 = ((t$154594) < (((long)(t$154595))));
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    if (!(t$154596)) {
                        
                        //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                        break;
                    }
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154580 = la$154610;
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154581 = h$154600;
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154582 = i$154592;
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154583 = ((double)(int)(((int)(t$154582))));
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154584 = ((t$154581) * (((double)(t$154583))));
                    
                    //#line 47 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    double x$154585 = ((t$154580) + (((double)(t$154584))));
                    
                    //#line 48 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154586 = sum$154622;
                    
                    //#line 48 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154587 = x$154585;
                    
                    //#line 48 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154588 = ParHello.f$O((double)(t$154587));
                    
                    //#line 48 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final double t$154589 = ((t$154586) + (((double)(t$154588))));
                    
                    //#line 48 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    sum$154622 = t$154589;
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154590 = i$154592;
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    final int t$154591 = ((t$154590) + (((int)(1))));
                    
                    //#line 46 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    i$154592 = t$154591;
                }
                
                //#line 50 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154623 = sum$154622;
                
                //#line 50 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double t$154624 = h$154600;
                
                //#line 50 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final double partial$154625 = ((t$154623) * (((double)(t$154624))));
                
                //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                final x10.lang.Place t$154626 = ((x10.lang.Place)((this.refToRes).home));
                {
                    
                    //#line 52 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                    x10.xrx.Runtime.runAt(((x10.lang.Place)(t$154626)), ((x10.core.fun.VoidFun_0_0)(new ParHello.$Closure$13(((x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>)(this.refToRes)), partial$154625, (ParHello.$Closure$13.__0$1x10$lang$Cell$1x10$lang$Double$2$2) null))), ((x10.xrx.Runtime.Profile)(null)));
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 40 "/home/frank/Desktop/Workspace/ArraySum/src/ParHello.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public double b;
        public double a;
        public int N;
        public x10.lang.Place p$154597;
        public x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> refToRes;
        
        public $Closure$14(final double b, final double a, final int N, final x10.lang.Place p$154597, final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> refToRes, __4$1x10$lang$Cell$1x10$lang$Double$2$2 $dummy) {
             {
                this.b = b;
                this.a = a;
                this.N = N;
                this.p$154597 = ((x10.lang.Place)(p$154597));
                this.refToRes = ((x10.core.GlobalRef)(refToRes));
            }
        }
        
    }
    
    }
    
    
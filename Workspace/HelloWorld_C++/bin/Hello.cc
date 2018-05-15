/*************************************************/
/* START of Hello */
#include <Hello.h>

#include <x10/lang/Double.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/xrx/Runtime.h>
#include <x10/xrx/FinishState.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/Reducible__SumReducer.h>
#include <x10/lang/Rail.h>
#include <x10/lang/String.h>
#include <x10/lang/System.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/String.h>
#ifndef HELLO__CLOSURE__1_CLOSURE
#define HELLO__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class Hello__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<Hello__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    void __apply(){
        
        //#line 23 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double h__1586 = ((((b) - (a))) / (((x10_double) (N))));
        
        //#line 24 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_long local_n__1587 = ((N) / ::x10aux::zeroCheck(((x10_long)(nTasks))));
        
        //#line 25 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double local_a__1588 = ((a) + (((((((x10_double) (tid__1596))) * (h__1586))) * (((x10_double) (local_n__1587))))));
        
        //#line 26 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double local_b__1589 = ((local_a__1588) + (((((x10_double) (local_n__1587))) * (h__1586))));
        
        //#line 27 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double sum__1590 = ((0.5) * (((::Hello::f(local_a__1588)) + (::Hello::f(
                                                                           local_b__1589)))));
        
        //#line 28 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        {
            x10_int i__1591;
            for (i__1591 = ((x10_int)1); ((((x10_long)(i__1591))) < (local_n__1587));
                 i__1591 = ((i__1591) + (((x10_int)1)))) {
                
                //#line 29 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
                x10_double x__1592 = ((local_a__1588) + (((h__1586) * (((x10_double) (i__1591))))));
                
                //#line 30 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
                sum__1590 = ((sum__1590) + (::Hello::f(x__1592)));
            }
        }
        {
            
            //#line 32 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
            ::x10::lang::CheckedThrowable* throwable__1629 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::xrx::Runtime::enterAtomic();
                    {
                        res = ((res) + (((sum__1590) * (h__1586))));
                    }
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc3) {
                {
                    ::x10::lang::CheckedThrowable* formal__1630 =
                      __exc3;
                    {
                        throwable__1629 = formal__1630;
                    }
                }
            }
            if ((!::x10aux::struct_equals(throwable__1629,
                                          reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL))))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__1629))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__1629));
                }
                
            }
            if (true) {
                ::x10::xrx::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(throwable__1629,
                                          reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL))))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__1629)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__1629));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_double b;
    x10_double a;
    x10_long N;
    x10_int nTasks;
    x10_long tid__1596;
    x10aux::captured_struct_lval<x10_double> res;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->b);
        buf.write(this->a);
        buf.write(this->N);
        buf.write(this->nTasks);
        buf.write(this->tid__1596);
        buf.write(this->res);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        Hello__closure__1* storage = ::x10aux::alloc_z<Hello__closure__1>();
        buf.record_reference(storage);
        x10_double that_b = buf.read<x10_double>();
        x10_double that_a = buf.read<x10_double>();
        x10_long that_N = buf.read<x10_long>();
        x10_int that_nTasks = buf.read<x10_int>();
        x10_long that_tid__1596 = buf.read<x10_long>();
        x10aux::captured_struct_lval<x10_double> that_res = buf.read<x10aux::captured_struct_lval<x10_double> >();
        Hello__closure__1* this_ = new (storage) Hello__closure__1(that_b, that_a, that_N, that_nTasks, that_tid__1596, that_res);
        return this_;
    }
    
    Hello__closure__1(x10_double b, x10_double a, x10_long N, x10_int nTasks, x10_long tid__1596, x10aux::captured_struct_lval<x10_double> res) : b(b), a(a), N(N), nTasks(nTasks), tid__1596(tid__1596), res(res) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10:22-33";
    }

};

#endif // HELLO__CLOSURE__1_CLOSURE
#ifndef HELLO__CLOSURE__2_CLOSURE
#define HELLO__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class Hello__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<Hello__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    void __apply(){
        
        //#line 44 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double h__1597 = ((((b) - (a))) / (((x10_double) (N))));
        
        //#line 45 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_long local_n__1598 = ((N) / ::x10aux::zeroCheck(((x10_long)(nTasks))));
        
        //#line 46 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double local_a__1599 = ((a) + (((((((x10_double) (tid__1607))) * (h__1597))) * (((x10_double) (local_n__1598))))));
        
        //#line 47 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double local_b__1600 = ((local_a__1599) + (((((x10_double) (local_n__1598))) * (h__1597))));
        
        //#line 48 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        x10_double sum__1601 = ((0.5) * (((::Hello::f(local_a__1599)) + (::Hello::f(
                                                                           local_b__1600)))));
        
        //#line 49 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        {
            x10_int i__1602;
            for (i__1602 = ((x10_int)1); ((((x10_long)(i__1602))) < (local_n__1598));
                 i__1602 = ((i__1602) + (((x10_int)1)))) {
                
                //#line 50 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
                x10_double x__1603 = ((local_a__1599) + (((h__1597) * (((x10_double) (i__1602))))));
                
                //#line 51 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
                sum__1601 = ((sum__1601) + (::Hello::f(x__1603)));
            }
        }
        
        //#line 53 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        ::x10::xrx::Runtime::makeOffer< x10_double >(((sum__1601) * (h__1597)));
    }
    
    // captured environment
    x10_double b;
    x10_double a;
    x10_long N;
    x10_int nTasks;
    x10_long tid__1607;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->b);
        buf.write(this->a);
        buf.write(this->N);
        buf.write(this->nTasks);
        buf.write(this->tid__1607);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        Hello__closure__2* storage = ::x10aux::alloc_z<Hello__closure__2>();
        buf.record_reference(storage);
        x10_double that_b = buf.read<x10_double>();
        x10_double that_a = buf.read<x10_double>();
        x10_long that_N = buf.read<x10_long>();
        x10_int that_nTasks = buf.read<x10_int>();
        x10_long that_tid__1607 = buf.read<x10_long>();
        Hello__closure__2* this_ = new (storage) Hello__closure__2(that_b, that_a, that_N, that_nTasks, that_tid__1607);
        return this_;
    }
    
    Hello__closure__2(x10_double b, x10_double a, x10_long N, x10_int nTasks, x10_long tid__1607) : b(b), a(a), N(N), nTasks(nTasks), tid__1607(tid__1607) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10:43-54";
    }

};

#endif // HELLO__CLOSURE__2_CLOSURE

//#line 5 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
x10_double Hello::f(x10_double x) {
    
    //#line 6 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    return ((((x) * (x))) * (x));
    
}

//#line 9 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
x10_double Hello::trap(x10_double a, x10_double b, x10_long N) {
    
    //#line 10 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_double h = ((((b) - (a))) / (((x10_double) (N))));
    
    //#line 11 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_double sum = ((0.5) * (((::Hello::f(a)) + (::Hello::f(b)))));
    
    //#line 12 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((((x10_long)(i))) < (N)); i = ((i) + (((x10_int)1))))
        {
            
            //#line 13 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
            x10_double x = ((a) + (((h) * (((x10_double) (i))))));
            
            //#line 14 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
            sum = ((sum) + (::Hello::f(x)));
        }
    }
    
    //#line 17 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    return ((sum) * (h));
    
}

//#line 20 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
x10_double Hello::sharedTrap(x10_double a, x10_double b, x10_long N,
                             x10_int nTasks) {
    
    //#line 21 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_double res = 0.0;
    {
        
        //#line 22 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
        ::x10::xrx::Runtime::ensureNotInAtomic();
        ::x10::xrx::FinishState* fs__1619 = ::x10::xrx::Runtime::startFinish();
        try {
            {
                x10_long i__1551min__1593 = ((x10_long)0ll);
                x10_long i__1551max__1594 = ((((x10_long)(nTasks))) - (((x10_long)1ll)));
                {
                    x10_long i__1595;
                    for (i__1595 = i__1551min__1593; ((i__1595) <= (i__1551max__1594));
                         i__1595 = ((i__1595) + (((x10_long)1ll))))
                    {
                        x10_long tid__1596 = i__1595;
                        ::x10::xrx::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(Hello__closure__1)))Hello__closure__1(b, a, N, nTasks, tid__1596, &(res)))));
                    }
                }
                
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc4) {
            {
                ::x10::lang::CheckedThrowable* ct__1612 =
                  __exc4;
                {
                    ::x10::xrx::Runtime::pushException(ct__1612);
                }
            }
        }
        ::x10::xrx::Runtime::stopFinish(fs__1619);
    }
    
    //#line 34 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    return res;
    
}

//#line 37 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
x10_double Hello::distTrap(x10_double a, x10_double b, x10_int N) {
    
    //#line 38 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    return 0.0;
    
}

//#line 41 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
x10_double Hello::reduceTrap(x10_double a, x10_double b, x10_long N,
                             x10_int nTasks) {
    
    //#line 42 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_double result;
    {
        ::x10::xrx::FinishState* fs__1626 = ::x10aux::class_cast_unchecked< ::x10::xrx::FinishState*>(::x10::xrx::Runtime::startCollectingFinish< x10_double >(
                                                                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Reducible<x10_double>*>(::x10::lang::Reducible__SumReducer<x10_double>::_make())));
        try {
            {
                
                //#line 43 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
                x10_long i__1569min__1604 = ((x10_long)0ll);
                x10_long i__1569max__1605 = ((((x10_long)(nTasks))) - (((x10_long)1ll)));
                {
                    x10_long i__1606;
                    for (i__1606 = i__1569min__1604; ((i__1606) <= (i__1569max__1605));
                         i__1606 = ((i__1606) + (((x10_long)1ll))))
                    {
                        x10_long tid__1607 = i__1606;
                        ::x10::xrx::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(Hello__closure__2)))Hello__closure__2(b, a, N, nTasks, tid__1607))));
                    }
                }
                
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc7) {
            {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  __exc7;
                {
                    ::x10::xrx::Runtime::pushException(__lowerer__var__0__);
                }
            }
        }
        result = ::x10::xrx::Runtime::stopCollectingFinish< x10_double >(
                   fs__1626);
    }
    
    //#line 56 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    return result;
    
}

//#line 61 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
/**
     * The main method for the Hello class
     */
void Hello::main(::x10::lang::Rail< ::x10::lang::String* >* id__486) {
    
    //#line 62 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_long time_1 = ::x10::lang::System::currentTimeMillis();
    
    //#line 63 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_double res = ::Hello::reduceTrap(((x10_double) (((x10_long)0ll))),
                                         ((x10_double) (((x10_long)10ll))),
                                         ((x10_long)1000000000ll),
                                         ((x10_int)8));
    
    //#line 64 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    x10_long time_2 = ::x10::lang::System::currentTimeMillis();
    
    //#line 65 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((&::Hello_Strings::sl__1679), ((time_2) - (time_1))), (&::Hello_Strings::sl__1680)), res)));
}

//#line 4 "/home/frank/Desktop/Workspace/HelloWorld_C++/src/Hello.x10"
::Hello* Hello::Hello____this__Hello() {
    return this;
    
}
void Hello::_constructor() {
    this->Hello::__fieldInitializers_Hello();
}
::Hello* Hello::_make() {
    ::Hello* this_ = new (::x10aux::alloc_z< ::Hello>()) ::Hello();
    this_->_constructor();
    return this_;
}


void Hello::__fieldInitializers_Hello() {
 
}
const ::x10aux::serialization_id_t Hello::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::Hello::_deserializer);

void Hello::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::Hello::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::Hello* this_ = new (::x10aux::alloc_z< ::Hello>()) ::Hello();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void Hello::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType Hello::rtt;
void Hello::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("Hello",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::String Hello_Strings::sl__1679("Time(ms):");
::x10::lang::String Hello_Strings::sl__1680(" ,Res:");

::x10::lang::VoidFun_0_0::itable<Hello__closure__1>Hello__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &Hello__closure__1::__apply, &Hello__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry Hello__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &Hello__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t Hello__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(Hello__closure__1::_deserialize);
const ::x10aux::serialization_id_t Hello__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(Hello__closure__1::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<Hello__closure__2>Hello__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &Hello__closure__2::__apply, &Hello__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry Hello__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &Hello__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t Hello__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(Hello__closure__2::_deserialize);
const ::x10aux::serialization_id_t Hello__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(Hello__closure__2::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of Hello */
/*************************************************/

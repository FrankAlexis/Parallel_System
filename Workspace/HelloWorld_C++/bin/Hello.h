#ifndef __HELLO_H
#define __HELLO_H

#include <x10rt.h>


namespace x10 { namespace xrx { 
class Runtime;
} } 
namespace x10 { namespace xrx { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible__SumReducer;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace io { 
class Console;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 

class Hello_Strings {
  public:
    static ::x10::lang::String sl__1679;
    static ::x10::lang::String sl__1680;
};

class Hello : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_double f(x10_double x);
    static x10_double trap(x10_double a, x10_double b, x10_long N);
    static x10_double sharedTrap(x10_double a, x10_double b, x10_long N, x10_int nTasks);
    static x10_double distTrap(x10_double a, x10_double b, x10_int N);
    static x10_double reduceTrap(x10_double a, x10_double b, x10_long N, x10_int nTasks);
    static void main(::x10::lang::Rail< ::x10::lang::String* >* id__486);
    virtual ::Hello* Hello____this__Hello();
    void _constructor();
    
    static ::Hello* _make();
    
    virtual void __fieldInitializers_Hello();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // HELLO_H

class Hello;

#ifndef HELLO_H_NODEPS
#define HELLO_H_NODEPS
#ifndef HELLO_H_GENERICS
#define HELLO_H_GENERICS
#endif // HELLO_H_GENERICS
#endif // __HELLO_H_NODEPS

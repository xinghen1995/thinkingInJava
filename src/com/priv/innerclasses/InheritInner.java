package com.priv.innerclasses;
// Inheriting an inner class.

class WithInner {
    class Inner { }
}

public class InheritInner extends WithInner.Inner {
    //! InheritInner { } // Won't compile
    InheritInner(WithInner wi) {
        wi.super(); // special synax
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

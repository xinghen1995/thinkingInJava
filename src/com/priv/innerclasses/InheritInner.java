package com.priv.innerclasses;
// Inheriting an inner class.

/**
 * 继承自内部类时，默认构造器不能提供一个外围类的引用。
 * 这是需要使用特殊语法enclosingClassReference.super()
 */
class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //! InheritInner { } // Won't compile
    InheritInner(WithInner wi) {
        wi.super(); // special syntax
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

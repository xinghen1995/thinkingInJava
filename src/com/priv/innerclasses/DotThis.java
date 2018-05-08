package com.priv.innerclasses;
// Qualifying access to the outer-class object.

/**
 * 如果在内部类返回外围类的引用，需要使用外围类的名字加点号,加this。
 * 直接使用this，得到的是内部类的引用。
 */

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this".
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}

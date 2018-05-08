package com.priv.polymorphism;
// Direct field access is determined at compile time.

/**
 * 多态仅用于普通方法调用，static和field没有多态的特性。
 */

// 方法访问导致多态，但是域访问并没有多态特性
//任何域访问操作都有编译器负责，而多态是动态绑定的结果婆
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field +
                ", sub.getField() = " + sub.getField() +
                ", sub.getSuperField() = " + sub.getSuperField());
    }
}

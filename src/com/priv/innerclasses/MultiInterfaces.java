package com.priv.innerclasses;
// Two ways that a class can implement multiple interfaces.

/**
 * 实现多重继承的两种方式：
 * 1.使用单一类
 * 2.使用内部类
 */

interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
    B makeB() {
        // Anonymous inner class:
        return new B() {
        };
    }
}

public class MultiInterfaces {
    static void takeA(A a) {
    }

    static void takeB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }
}

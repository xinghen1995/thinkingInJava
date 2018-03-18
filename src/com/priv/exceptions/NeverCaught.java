package com.priv.exceptions;

/**
 * RuntimeException不受编译器检查，因为它属于编程错误。
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}

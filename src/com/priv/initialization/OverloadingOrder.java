package com.priv.initialization;
// Overloading based on the order of the arguments.
// 基于方法参数的顺序来重载方法。缺点是代码难以维护

import static com.priv.util.Print.print;

public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        print("int: " + i + " :String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}

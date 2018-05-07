package com.priv.initialization;
// Calling constructors with "this"
/**
 * this + 参数列表 构成了构造器的调用。
 * 限制：
 * 1.不能再一个构造器中，多次使用this(argument)的构造器
 * 2.非构造构造方法的方法不可以使用
 * 3.该方法调用必须位于方法第一行
 * <p>
 * static方法 就是没有this的方法
 * static方法内部不能调用非static方法
 */

import static com.priv.util.Print.print;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor w/ int arg only. petalCount= " + petalCount);
    }

    Flower(String ss) {
        print("Constructor w/ String arg only. s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        //! this(s); 不能再次调用
        this.s = s;
        print("String & int args");
    }

    Flower() {
        this("hi", 47);
        print("default constructor (no args)");
    }

    void printPetalCount() {
        //! this(11);
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

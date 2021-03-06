package com.priv.reusing;

/**
 * “类在首次使用时发生加载”有两层含义：
 * 1.创建类实例
 * 2.使用static成员
 */

import static com.priv.util.Print.print;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
/**
 * 首先查找Beetle.main()函数，它是一个静态函数，发现有个基类，对基类进行初始化(并非创建实例)，
 * 然后对Beetle进行初始化，之后进行调用构造函数
 */
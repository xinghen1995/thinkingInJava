package com.priv.reusing;
// Constructor calls during inheritance.
/**
 * 当创建了一个导出类的对象时，该对象包含了一个
 * 基类的子对象。
 * Java会自动在导出类的构造器中插入对基类构造器的调用。
 * 但是如果基类没有默认构造器，构造器有参数，则必须显示调用。
 */

import static com.priv.util.Print.print;

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

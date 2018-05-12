package com.priv.strings;

import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n", u);
//        IllegalFormatConversionException: d != java.lang.Character
//        f.format("d: %d\n", u);
        f.format("c: %c\n", u);
//        f.format("f: %f\n", u);
//        f.format("x: %x\n", u);
//        f.format("e: %e\n", u);
//        散列码
        f.format("h: %h\n", u);

        int v = 121;
        System.out.println("v = 121");
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);

    }
}

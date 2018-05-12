package com.priv.strings;

import static com.priv.util.Print.print;

/**
 * String 不可变性，只能产生新的引用
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q); // howdy
        String qq = upcase(q);
        print(qq); // HOWDY
        print(q);
    }
}

package com.priv.strings;

import static com.priv.util.Print.*;

/**
 * String 不可变性，只能产生新的引用
 */
public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q);
        String qq = upcase(q);
        print(qq);
        print(q);
    }
}

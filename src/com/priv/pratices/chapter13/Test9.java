package com.priv.pratices.chapter13;

import com.priv.strings.Splitting;

import java.util.Arrays;

public class Test9 {
    static String s = Splitting.knight;
    public static void main(String[] args) {
        System.out.println(s.replaceAll("[aeiouAEIOU]", "_"));
    }
}

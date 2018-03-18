package com.priv.pratices.chapter13;

import com.priv.strings.Splitting;

import java.util.Arrays;

public class Test8 {
    static String s = Splitting.knight;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(s.split("the|you")));
    }
}

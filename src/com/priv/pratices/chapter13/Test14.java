package com.priv.pratices.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test14 {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
    }
}

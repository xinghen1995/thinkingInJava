package com.priv.strings;

import java.util.Arrays;

public class Splitting {
    public static String knight =
            "Then, when you have found the shrubbery, you must" +
                    " cut down the mightiest tree in the forest... " +
                    "with... a herring!";
    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knight.split(regex))
        );
    }
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}

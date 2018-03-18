package com.priv.pratices.chapter13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test7 {
    public static boolean checkRegex(String str) {
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        return pattern.matcher(str).matches();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while(!(s = in.nextLine()).equals("")) {
            System.out.println(checkRegex(s));
        }
    }
}

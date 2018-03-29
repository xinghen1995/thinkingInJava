package com.priv.pratices.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 {
    public static void main(String[] args) {
        String str = "Arline ate eight appes and one orange while Anita hadn't any";
        Pattern p = Pattern.compile("((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}

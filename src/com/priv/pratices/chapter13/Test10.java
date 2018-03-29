package com.priv.pratices.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    public static String str = "Java now has regular expressio";

    public static void check(String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.println(m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
    public static void main(String[] args) {
        String[] regexs = new String[] {
                "^Java",
                "\\Breg.*",
                "n.w\\s+h(a|i)s",
                "s?",
                "s*",
                "s+",
                "s{4}",
                "s{1}",
                "s{0,3}"
        };
        for(String regex : regexs)
            check(regex);
    }
}

package com.priv.pratices.chapter13;

import com.priv.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java content
 */
public class Test16 {
    // Can you catch it?
    public static void main(String[] args) {
        String content = TextFile.read("src/com/priv/pratices/chapter13/Test16.java");
        Pattern p = Pattern.compile("(\\/\\*(.|[\r\n])*?\\*\\/)|(\\/\\/[^\\n]*)");
        Matcher m = p.matcher(content);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}

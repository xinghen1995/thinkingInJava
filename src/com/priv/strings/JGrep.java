package com.priv.strings;
// A very simple version of the "grep" program.

/**
 * 控制台中的正则表达式被读取时已经经过转换，因此，
 * 不要输出\\b这种形式，而是直接输入\b即可。
 */

import com.priv.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(-1);
        }
        Pattern p = Pattern.compile(args[1]);
        // Iterate through the lines of input file:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
            }
        }
    }
}

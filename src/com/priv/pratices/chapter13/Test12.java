package com.priv.pratices.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {
    static public final String POEM =
            "Twas brillig, and the slithy tove\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All missy were the borogoves.\n" +
                    "And the more raths outgrabe.\n\n" +
                    "Beware the jabberwock, my son,\n" +
                    "The jaws hat bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("[^A-Z]\\w*")
                        .matcher(POEM);
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                System.out.print("[" + m.group(j) + "]");
            System.out.println();
        }
    }
}

package com.priv.strings;

import java.util.regex.*;

public class Groups {
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
                Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                .matcher(POEM);
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                System.out.print("[" + m.group(j) + "]");
            System.out.println();
        }
    }
}

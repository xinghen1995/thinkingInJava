package com.priv.holding;

import com.priv.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/com/priv/holding/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}

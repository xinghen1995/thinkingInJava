package com.priv.holding;

import com.priv.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(
                new TextFile("src/com/priv/holding/SetOperations.java", "\\W+")
        );
        System.out.println(words);
    }
}

package com.priv.pratices.chapter11;

import java.util.HashMap;
import java.util.Map;

import static com.priv.util.Print.print;

public class Test17 {
    public static Map<String, Gerbil> gerbilMap =
            new HashMap<>();

    static {
        gerbilMap.put("Fuzzy", new Gerbil());
        gerbilMap.put("Spot", new Gerbil());
    }

    public static void main(String[] args) {
        for (String name : gerbilMap.keySet()) {
            print(name);
            gerbilMap.get(name).hop();
        }
    }
}

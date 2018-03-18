package com.priv.pratices.chapter11;
import java.util.*;

import static com.priv.util.Print.print;

public class Test4 {
    private static int counter;
    private static List<String> films = new ArrayList<String>(Arrays.asList(
            "Snow White", "Star War"
    ));
    static String next() {
        counter = counter % films.size();
        return films.get(counter++);
    }
    static Collection fill(Collection<String> collection) {
        for(int i = 0; i < 5; i++)
            collection.add(next());
        return collection;
    }
    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new TreeSet<String>()));
    }
}

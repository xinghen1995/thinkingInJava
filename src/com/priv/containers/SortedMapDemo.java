package com.priv.containers;
// What you can do with a TreeMap.

import com.priv.util.CountingMapData;

import java.util.Iterator;
import java.util.TreeMap;

import static com.priv.util.Print.print;

public class SortedMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap =
                new TreeMap<Integer, String>(new CountingMapData(25));
        print(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        print(low);
        print(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();
            else it.next();
        }
        print(low);
        print(high);
        print(sortedMap.subMap(low, high));
        print(sortedMap.headMap(high));
        print(sortedMap.tailMap(low));
    }
}

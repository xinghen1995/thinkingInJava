package com.priv.holding;
/**
 * TreeSet底层采用红黑树存储，如果要保证输出顺序，
 * 使用TreeSet比较好。而HashSet和LinkeHashSet底层采用散列函数
 */

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}

package com.priv.holding;
/**
 * “不保证有序”和“保证无序”是不同的概念，在JDK8之后，HashSet的
 * 底层实现改变，且这里是Integer类型，与Hash码相同，产生了有序现象，
 * 但不能用这种方法来保证有序输出。
 */

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}

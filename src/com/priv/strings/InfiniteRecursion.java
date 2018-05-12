package com.priv.strings;
// Accidental recursion

/**
 * "InfiniteRecursion address: " + this 这里本身会调用toString()进行字符转，
 * 如果在toString()方法中应用这个方式，那么将导致递归
 */

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}

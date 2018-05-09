package com.priv.holding;
// The "Adapter Method" idiom allows you to use foreach
// With additional kinds of Iterator.

/**
 * 为了满足foreach不同的行为，关键是为foreach提供不同的iterator，
 * 利用“适配器模式”对原有ArrayList进行包装，提供不同的iterator.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) { // 原有的向后的iterator
        super(c);
    }

    public Iterable<T> reversed() { // 反序的iterator
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public T next() {
                        return get(current--);
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<>(
                        Arrays.asList("To be or not to be".split(" "))
                );
        for (String s : ral)
            System.out.print(s + " ");
        System.out.println();
        for (String s : ral.reversed())
            System.out.print(s + " ");
    }
}

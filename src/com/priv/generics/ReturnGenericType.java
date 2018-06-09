package com.priv.generics;

public class ReturnGenericType<T extends HasF> {
    T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
}
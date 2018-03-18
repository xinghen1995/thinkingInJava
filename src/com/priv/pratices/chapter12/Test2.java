package com.priv.pratices.chapter12;

public class Test2 {
    public static Object obj;
    public static void main(String[] args) {
        try {
            obj.hashCode();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

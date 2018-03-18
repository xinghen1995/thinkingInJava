package com.priv.pratices.chapter12;

public class Test3 {
    public static void main(String[] args) {
        int[] ints = {1, 2};
        try {
            ints[3] = 0;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

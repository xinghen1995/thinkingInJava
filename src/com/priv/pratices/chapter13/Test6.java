package com.priv.pratices.chapter13;

public class Test6 {
        int a = 0;
        long b = 1L;
        float c = 1.0f;
        double d = 2.0;
        public String toString() {
            return String.format("TestItem: (%5d,%5d, %5f, %5f)\n", a, b, c, d);
        }
    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t);
    }
}

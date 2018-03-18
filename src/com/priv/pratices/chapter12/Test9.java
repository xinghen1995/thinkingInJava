package com.priv.pratices.chapter12;

class Exception1 extends Exception {
}

class Exception2 extends Exception {
}

class Exception3 extends Exception {
}

public class Test9 {
    public static void f() throws Exception1, Exception2, Exception3 {
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception e) {

        }
    }
}

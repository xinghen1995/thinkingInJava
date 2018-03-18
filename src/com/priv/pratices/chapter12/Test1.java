package com.priv.pratices.chapter12;

class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}
public class Test1 {
    public static void main(String[] args) {
        try {
            throw new MyException("MyException threw here!");
        } catch (MyException e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Exec here");
        }
    }
}

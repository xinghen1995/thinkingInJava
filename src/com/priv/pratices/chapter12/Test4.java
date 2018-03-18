package com.priv.pratices.chapter12;

class MyException1 extends Exception {
    private String msg;
    public MyException1(String msg) {
        this.msg = msg;
    }
    public void display() {
        System.out.println(msg);
    }
}
public class Test4 {
    public static void main(String[] args) {
        try {
            throw new MyException1("MyException1");
        } catch (MyException1 e) {
            e.display();
            e.printStackTrace();
        }
    }
}

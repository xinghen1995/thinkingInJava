package com.priv.reusing;

class Poppet {
    private int i;
    Poppet(int i) {
        this.i = i;
    }
}
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;
    //必须在类的构造器中对空白final的值进行定义，否则不可编译
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

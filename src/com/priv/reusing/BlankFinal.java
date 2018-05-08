package com.priv.reusing;
// "Blank" final fields.
// 一个域因类的不同而有不同的值，且是恒定的值。

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0; // Initialized final
    private final int j; // Blank final
    private final Poppet p; // Blank final reference

    // Blank finals MUST be initialized in the constructor:
    //必须在类的构造器中对空白final的值进行定义，否则不可编译
    public BlankFinal() {
        j = 1; // Initialize blank final
        p = new Poppet(1); // Initialize blank final reference
    }

    public BlankFinal(int x) {
        j = x; // Initialize blank final
        p = new Poppet(x); // Initialize blank final reference
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

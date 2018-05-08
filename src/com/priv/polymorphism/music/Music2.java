package com.priv.polymorphism.music;
// Overriding instead of upcasting.
/**
 * 多态的实现是基于动态绑定的原理。即程序在运行时才知道对象的类型。
 * 用final和static可以关闭动态绑定。然而，对性能不会产生多大的影响，应该
 * 依据设计来使用final而不是依据性能。
 */

import static com.priv.util.Print.print;

class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    public void play(Note n) {
        print("Brass.play() " + n);
    }
}

public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
}

package com.priv.pratices.chapter13;

import java.io.PrintStream;
import java.util.Formatter;

class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s the Turtle is at (%d, %d)\n", name, x, y);
    }
}
public class Test3 {
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(outAlias));
        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        tommy.move(0, 0);
        terry.move(4, 8);
        terry.move(3, 4);
        tommy.move(3, 2);
    }
}

package com.priv.initialization;
import static com.priv.util.Print.*;

class Tree {
    int height;
    Tree() {
        print("Planting a seeding.");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " + height + " feet tall.");
    }
    void info() {
        print("Tree is " + height + " feet tall.");
    }
    void info(String s) {
        print(s + " : Tree is " + height + " feet tall.");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }
        new Tree();
    }
}

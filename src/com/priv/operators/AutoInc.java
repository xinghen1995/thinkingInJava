package com.priv.operators;
// Demonstrates the ++ and -- operators.
import static com.priv.util.Print.*;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i);
        print("i++ : " + i++);
        print("i : " + i);
        print("--i : " + --i);
        print("i-- : " + i--);
        print("i : " + i);
    }
}

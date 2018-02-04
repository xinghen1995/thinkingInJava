package com.priv.control;
// For loops with "labeled break" and "labeled continue."
import static com.priv.util.Print.*;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for(; true;) {
            inner:
            for(; i < 10; i++) {
                print("i = " + i);
                if(i == 2) {
                    print("continue");
                }
            }
        }
    }
}

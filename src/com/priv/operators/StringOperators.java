package com.priv.operators;

import static com.priv.util.Print.*;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z) ;
        print(x + " " + z);
        s += "(summed) = ";
        print(s + (x + y + z));
        print("" + x); // 这里是Integer.toString()的简写形式
    }
}

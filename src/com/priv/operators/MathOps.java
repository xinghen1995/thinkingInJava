package com.priv.operators;
// Demonstrates the mathmatical operators.
import java.util.*;
import static com.priv.util.Print.*;

public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator
        Random rand = new Random(47);
        int i, j, k;
        // Choose value from 1 to 100
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i);
        i = j - k;
        print("j - k : " + i);
        i = j / k;
        print("j / k : " + i);
        i = j * k;
        print("j * k : " + i);
        i = j % k;
        print("j % k : " + i);
        // Floating-point number tests:
        float u, v, w; // Applies to doubles, too
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w : " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
        // The following also works for char, byte, short, int , long, and double
        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);
    }
}

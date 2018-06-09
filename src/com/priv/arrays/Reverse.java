package com.priv.arrays;

import com.priv.util.Generated;

import java.util.Arrays;
import java.util.Collections;

import static com.priv.util.Print.print;

public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        print("beforing sorting");
        print(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        print("after sorting");
        print(Arrays.toString(a));
    }
}

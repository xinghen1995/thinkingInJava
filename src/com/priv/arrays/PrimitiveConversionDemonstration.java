package com.priv.arrays;

import com.priv.util.ConvertTo;
import com.priv.util.CountingGenerator;
import com.priv.util.Generated;

import java.util.Arrays;

public class PrimitiveConversionDemonstration {
    public static void main(String[] args) {
        Integer[] a = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
        int[] b = ConvertTo.primitive(a);
        System.out.println(Arrays.toString(b));
        boolean[] c = ConvertTo.primitive(
                Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7)
        );
        System.out.println(Arrays.toString(c));
    }
}

package com.priv.util;

// Array creation methods that can be used without
// qualifiers. using Java SE5 static imports.
public class Range {
    // produce a sequence [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    // produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }

    // produce a sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }
}

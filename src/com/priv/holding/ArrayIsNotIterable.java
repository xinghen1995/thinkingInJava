package com.priv.holding;
// foreach可用于任何数组或者其它Iterable，但是这不意味着
//数组肯定是一个Iterable，自动转换不会发生，需要手动执行。
/**
 * 数组可以直接使用foreach访问，但数组不是Iterable对象，
 * 需要转换
 */

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // 自动转换不会发生
        //! test(strings);
        //手动进行转换
        test(Arrays.asList(strings));
    }
}

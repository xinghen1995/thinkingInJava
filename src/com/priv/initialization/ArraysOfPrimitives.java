package com.priv.initialization;

import static com.priv.util.Print.print;

/**
 * java不允许指定数组大小，只能在初始化的时候指定
 * 拥有的仅仅是数组的引用
 *
 * 所有的数组都有一个固定成员length，不能对其修改
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for (int i = 0; i < a1.length; i++)
            print("a1[" + i + "] = " + a1[i]);
    }
}

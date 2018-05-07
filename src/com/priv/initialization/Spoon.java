package com.priv.initialization;

/**
 * 显式初始化静态成员
 */
public class Spoon {
    static int i;

    static { // 静态初始化块
        i = 47;
    }
}

package com.priv.initialization;
// Constructors can have arguments.

/**
 * java中，“初始化”和“创建”捆绑在一起，两者不能分离
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}

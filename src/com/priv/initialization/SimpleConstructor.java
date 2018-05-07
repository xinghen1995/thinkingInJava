package com.priv.initialization;
// Demonstrate of a simple constructor.

/**
 * 构造器方法签名的两个考虑因素：
 * 1.所取的任何名字都可能和类成员的名字冲突。
 * 2.必须让编译器知道如何调用这个方法。
 */
class Rock {
    Rock() { // This is the constructor
        System.out.print("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}

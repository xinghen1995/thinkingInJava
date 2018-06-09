package com.priv.generics;

/**
 * 编译器通过类型擦除，将泛型类型参数擦除到了它的第一个边界，
 * 在本例中就好像T被HasF取代了一样
 */
public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}

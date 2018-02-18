package com.priv.innerclasses;
// Calling the base-class constructor
// 带有参数的匿名内部类，调用基类的构造方法，但实际上创建的是基类的子类.
public class Parcel8 {
    public Wrapping wrappig(int x) {
        // Base constructor call;
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrappig(10);
    }
}

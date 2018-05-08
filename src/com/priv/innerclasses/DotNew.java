package com.priv.innerclasses;
// Creating an inner class directly using the .new sytax.

/**
 * 创建内部类的对象之前，必须获得外围类的对象，使用该对象.new可以
 * 创建内部类。
 * 内部类会暗自联系到其外围类的对象上。
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

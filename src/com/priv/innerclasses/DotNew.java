package com.priv.innerclasses;
// Creating an inner class directly using the .new sytax.

public class DotNew {
    public class Inner { }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

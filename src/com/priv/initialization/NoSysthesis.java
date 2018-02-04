package com.priv.initialization;

class Bird2 {
    Bird2(int i) { }
    Bird2(double d) { }
}
public class NoSysthesis {
    public static void main(String[] args){
        //! new Bird2()
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}

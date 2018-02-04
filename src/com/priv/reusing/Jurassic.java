package com.priv.reusing;

class SmallBrain { }

//final 修饰的类不允许继承
final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() { }
}

//! class Further extends Dinosaur { }
public class Jurassic {
    public static void main(String[] args){
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

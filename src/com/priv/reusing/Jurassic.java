package com.priv.reusing;
// Making a entry class final.
// final类中所有元素隐含为final的，因为无法覆盖它们

class SmallBrain {
}

//final 修饰的类不允许继承
final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}

//! class Further extends Dinosaur { }
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

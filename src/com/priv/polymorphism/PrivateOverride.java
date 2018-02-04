package com.priv.polymorphism;
import static com.priv.util.Print.*;
// 这里的多态导致了私有方法被覆盖
public class PrivateOverride {
    private void f() { print("private f()"); }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() { print("public f()"); }
}

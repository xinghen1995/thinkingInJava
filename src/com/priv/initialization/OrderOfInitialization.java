package com.priv.initialization;
import static com.priv.util.Print.*;

class Window {
    Window(int marker) { print("Window(" + marker + ")");}
}
class Hourse {
    Window w1 = new Window(1);
    Hourse() {
        print("Hourse()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() { print("f()"); }
    Window w3 = new Window(3);
}
public class OrderOfInitialization {
    public static void main(String[] args) {
        /*类的构造函数调用之前，类中的成员将被默认初始化*/
        Hourse h = new Hourse();
        h.f();
    }
}

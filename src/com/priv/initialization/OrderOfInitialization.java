package com.priv.initialization;
// Demonstrates initialization order.

import static com.priv.util.Print.print;

// When the constructor is called to create a
// Window object, you'll see a message:
class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Before constructor

    House() {
        // Show that we're in the constructor:
        print("House()");
        w3 = new Window(33); // Reinitialize w3
    }

    Window w2 = new Window(2); // After constructor

    void f() {
        print("f()");
    }

    Window w3 = new Window(3);  // At end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        /*类的构造函数调用之前，类中的成员将被默认初始化*/
        House h = new House();
        h.f(); // Shows that construction is done
    }
}

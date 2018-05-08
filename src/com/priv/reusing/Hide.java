package com.priv.reusing;
// Overloading a base-class method name in a derived class
// does not hide the base-class versions.

import static com.priv.util.Print.print;

//在继承中重载基类的函数并不会导致基类消失，并且如果使用基类的参数，而该方法在子类中不存在
//那么将访问到基类的方法
class Homer {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    void doh(Milhouse m) {
        print("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}

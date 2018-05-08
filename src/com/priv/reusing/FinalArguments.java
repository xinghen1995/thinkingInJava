package com.priv.reusing;

// final作为参数意味着无法在方法内更改引用
// 只有在明确禁止继承时，采用final修饰方法。
class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        //! g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
// final修饰基本类型的参数，意味着该参数只能被读取，而不能修改，这以特性
    // 通常用作内部类的参数使用
//    void f(final int i) {
//        i++;
//    } // Can't change.
    // You can only read framo a final primitive:

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}

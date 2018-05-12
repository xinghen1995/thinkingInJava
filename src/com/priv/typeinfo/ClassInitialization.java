package com.priv.typeinfo;
/**
 * 当使用".class"创建对Class对象的引用时，不会自动初始化该Class对象。
 * <p>
 * 为了使用类的准备步骤:
 * 1.加载。这是类加载器执行的。该步骤将查找字节码，并从字节码中创建出一个Class对象。
 * 2.链接。在链接阶段将验证类中的字节码，为静态域分配存储空间，并且如果必需的话，将
 * 解析这个类创建的其他类的所有引用。
 * 3.初始化。如果该类有超类，则对其初始化，执行静态初始化器和静态初始化块。
 * <p>
 * static final的编译器常量可以直接访问，而不需要初始化类。
 */

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int statiNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class; // 这里没有执行Initable类的初始化
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.priv.typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.statiNonFinal);
    }
}

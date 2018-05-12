package com.priv.typeinfo.toys;
// Testing class Class.
/**
 * 传递给forName()的字符串中，必须使用全限定名(包含包名)
 */

import static com.priv.util.Print.print;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface newInterface {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots,
        newInterface {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.priv.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // 必须有默认的构造器，可以传递不同的方法
            // 但必须执行类型转换
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Can't instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

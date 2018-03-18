package com.priv.pratices.chapter14;
import com.priv.polymorphism.shape.Circle;

import static com.priv.util.Print.*;

public class Test6 {
    public static void inherited(Object object)  {
        Class c = object.getClass();
        while(true) {
            print(c.getName());
            if(c.getName().equals("java.lang.Object")) return;
            c = c.getSuperclass();
        }
    }
    public static void main(String[] args) {
         inherited(new Circle());
    }
}

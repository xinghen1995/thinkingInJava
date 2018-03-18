package com.priv.pratices.chapter14;

import java.lang.reflect.Field;

import static com.priv.util.Print.print;

public class Test7 {
    public static void getFields(Object obj) {
        Class c = obj.getClass();
        for(Field f : c.getDeclaredFields())
            print(f.getType() + " : " + f.getName());
    }
    public static void main(String[] args) {
        getFields(new com.priv.reusing.Bath());
    }
}

package com.priv.typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        genericIntClass = Integer.TYPE;
        intClass = double.class;
        // genericIntClass = double.class;
    }
}

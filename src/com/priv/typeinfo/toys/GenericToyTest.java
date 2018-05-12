package com.priv.typeinfo.toys;
// Testing class Class:

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> flClass = FancyToy.class;
        FancyToy fancyToy = flClass.newInstance();
        Class<? super FancyToy> up = flClass.getSuperclass();
        // Class<Toy> up2 = flClass.getSuperclass();
        Object obj = up.newInstance();
    }
}

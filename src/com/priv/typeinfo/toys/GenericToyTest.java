// com/priv/typeinfo/toys/GenericToyTest
// Testing class Class
package com.priv.typeinfo.toys;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> flClass = FancyToy.class;
        FancyToy fancyToy = flClass.newInstance();
        Class<? super FancyToy> up = flClass.getSuperclass();
//        Class<Toy> up = flClass.getSuperclass();
        Object obj = up.newInstance();
    }
}

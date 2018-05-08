package com.priv.polymorphism;

import com.priv.polymorphism.shape.RandomShapeGenerator;
import com.priv.polymorphism.shape.Shape;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator(3);

    public static void main(String[] args) {
//        Shape[] s = new Shape[9];
//        for(int i = 0; i < s.length; i++)
//            s[i] = gen.next();
        for (Shape shape : gen)
            shape.draw();
//        for(Shape shp : s)
//            shp.draw();
    }
}

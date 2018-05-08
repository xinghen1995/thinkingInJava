package com.priv.polymorphism.shape;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private int num = 0;
    private Random rand = new Random(47);

    //    public RandomShapeGenerator() { }
    public RandomShapeGenerator(int num) {
        this.num = num;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count = 0;

            public boolean hasNext() {
                return count++ < num;
            }

            public Shape next() {
                switch (rand.nextInt(3)) {
                    default:
                    case 0:
                        return new Circle();
                    case 1:
                        return new Square();
                    case 2:
                        return new Triangle();
                }
            }
        };
    }
//    public Shape next() {
//        switch(rand.nextInt(3)) {
//            default:
//            case 0 : return new Circle();
//            case 1 : return new Square();
//            case 2 : return new Triangle();
//        }
//    }
}

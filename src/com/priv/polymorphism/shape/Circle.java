package com.priv.polymorphism.shape;
import static com.priv.util.Print.*;

public class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }
    @Override
    public void erase() {
        print("Circle.erase()");
    }
}

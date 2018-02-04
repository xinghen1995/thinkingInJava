package com.priv.polymorphism.shape;
import static com.priv.util.Print.*;

public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }
    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}

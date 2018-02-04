package com.priv.polymorphism.shape;
import static com.priv.util.Print.*;

public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }
    @Override
    public void erase() {
        print("Square.erase()");
    }
}

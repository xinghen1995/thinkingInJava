package com.priv.typeinfo;
import java.util.*;
import static com.priv.util.Print.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape {
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class Shapes {
    public static void rotate(Shape shape) {
        if(shape instanceof Circle)
            return;
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList)
            shape.draw();
        Rhomboid r = new Rhomboid();
        Shape s = (Shape)r;
        Circle c = null;
        if(s instanceof Circle)
            c = (Circle)s;
        else if(s instanceof Rhomboid)
            r = (Rhomboid)s;
//        Circle c = (Circle)r;
    }
}

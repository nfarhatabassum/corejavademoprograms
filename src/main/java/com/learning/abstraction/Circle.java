package com.learning.abstraction;

public class Circle extends Shape{

    private int radius;

    public Circle(String type, int radius) {
        super(type);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*(radius*radius);
    }

    @Override
    public double calulatePerimeter() {
        return 2*3.14*radius;
    }
}

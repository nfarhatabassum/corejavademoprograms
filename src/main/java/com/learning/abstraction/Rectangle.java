package com.learning.abstraction;

public class Rectangle extends Shape{
    private int length;
    private int breadth;

    public Rectangle(String type, int length, int breadth) {
        super(type);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public double calulatePerimeter() {
        return 2*(length+breadth);
    }
}

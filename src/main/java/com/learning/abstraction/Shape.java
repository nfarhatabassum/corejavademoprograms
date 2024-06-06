package com.learning.abstraction;

public  abstract class Shape implements CompareShape{
    private String type;


    public Shape(String type) {
        this.type = type;
    }

    public  abstract double calculateArea();
    public  abstract double calulatePerimeter();

    public String getShapeType(){
       return "Shape Type is "+type;
    }

    @Override
    public boolean compareArea(Shape shape1, Shape shape2) {
        return shape1.calculateArea()==shape2.calculateArea();
    }

    @Override
    public boolean comparePermiter(Shape shape1, Shape shape2) {
        return shape1.calulatePerimeter()==shape2.calulatePerimeter();
    }
}

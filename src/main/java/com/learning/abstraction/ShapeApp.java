package com.learning.abstraction;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle("Rectangle",4,8);
        Shape circle = new Circle("Circle",5);
//       Shape[] shapes = {rect,circle};
//        displayShape(shapes);
        System.out.println("Compare Area "+rect.compareArea(rect,rect));
    }

    private static void displayShape(Shape[] shapes) {
        for (Shape shape:shapes) {
            System.out.println(shape.getShapeType()+" Area "+shape.calculateArea()+" Perimeter "+shape.calulatePerimeter());
        }
    }

}

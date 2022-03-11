package com.lab.exercise4;


public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape.toLowerCase().equals("circle")){
            return new Circle();
        }else if (shape.toLowerCase().equals("square")){
            return new Square();
        }else if (shape.toLowerCase().equals("rectangle")){
            return new Rectangle();
        }else {
            return new Triangle();
        }
    }
}

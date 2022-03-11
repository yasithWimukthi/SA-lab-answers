package com.lab.exercise4;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
        System.out.println("" +
                "#######\n" +
                "#     #\n" +
                "#     #\n" +
                "#######\n");
    }
}

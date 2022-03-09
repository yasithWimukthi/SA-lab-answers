package com.lab.exercise2;

public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Stripping coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

}

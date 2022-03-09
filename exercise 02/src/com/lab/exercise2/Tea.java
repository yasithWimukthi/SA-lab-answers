package com.lab.exercise2;

public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the Tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon.");
    }

}

package com.lab.exercise2;

public class Main {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareRecepie();
        System.out.println("=========================================");
        Beverage coffee = new Coffee();
        coffee.prepareRecepie();
    }
}

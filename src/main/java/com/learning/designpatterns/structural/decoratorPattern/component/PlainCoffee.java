package com.learning.designpatterns.structural.decoratorPattern.component;

public class PlainCoffee implements Coffee{
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "Plain Coffee";
    }
}

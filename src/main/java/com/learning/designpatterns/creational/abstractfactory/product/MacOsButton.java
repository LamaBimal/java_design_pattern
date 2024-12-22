package com.learning.designpatterns.creational.abstractfactory.product;

// concrete Product
public class MacOsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering MacOs Button");
    }
}

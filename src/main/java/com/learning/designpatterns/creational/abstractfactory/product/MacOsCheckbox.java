package com.learning.designpatterns.creational.abstractfactory.product;

// concrete product
public class MacOsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println(" Rendering MacOs Checkbox ");
    }
}

package com.learning.designpatterns.creational.abstractfactory.product;

// concrete product
public class WindowsButton implements Button{
    @Override
    public void render(){
        System.out.println(" Rendering Windows Button ");
    }
}

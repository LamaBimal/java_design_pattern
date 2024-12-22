package com.learning.designpatterns.creational.abstractfactory.product;

import com.learning.designpatterns.creational.abstractfactory.product.Checkbox;

// concrete product
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println(" Rendering Windows Checkbox ");
    }
}

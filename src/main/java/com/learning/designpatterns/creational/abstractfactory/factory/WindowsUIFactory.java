package com.learning.designpatterns.creational.abstractfactory.factory;

import com.learning.designpatterns.creational.abstractfactory.product.WindowsCheckbox;
import com.learning.designpatterns.creational.abstractfactory.product.Button;
import com.learning.designpatterns.creational.abstractfactory.product.Checkbox;
import com.learning.designpatterns.creational.abstractfactory.product.WindowsButton;

// concrete factory class
public class WindowsUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

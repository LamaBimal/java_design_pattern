package com.learning.designpatterns.creational.abstractfactory.factory;

import com.learning.designpatterns.creational.abstractfactory.product.Button;
import com.learning.designpatterns.creational.abstractfactory.product.Checkbox;
import com.learning.designpatterns.creational.abstractfactory.product.MacOsButton;
import com.learning.designpatterns.creational.abstractfactory.product.MacOsCheckbox;

public class MacOsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}

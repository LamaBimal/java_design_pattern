package com.learning.designpatterns.creational.abstractfactory.factory;

import com.learning.designpatterns.creational.abstractfactory.product.Button;
import com.learning.designpatterns.creational.abstractfactory.product.Checkbox;

// abstract factory
public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

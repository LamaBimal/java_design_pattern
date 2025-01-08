package com.learning.designpatterns.structural.decoratorPattern.decorator;

import com.learning.designpatterns.structural.decoratorPattern.component.Coffee;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost()+2.0;
    }

    @Override
    public String description() {
        return super.description()+", Milk";
    }
}

package com.learning.designpatterns.structural.decoratorPattern.decorator;

import com.learning.designpatterns.structural.decoratorPattern.component.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    protected Coffee coffee;

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost(){
        return super.cost()+ 1.0;
    }

    @Override
    public String description() {
        return super.description()+", Sugar";
    }
}

package com.learning.designpatterns.structural.decoratorPattern;

import com.learning.designpatterns.structural.decoratorPattern.component.Coffee;
import com.learning.designpatterns.structural.decoratorPattern.component.PlainCoffee;
import com.learning.designpatterns.structural.decoratorPattern.decorator.MilkDecorator;
import com.learning.designpatterns.structural.decoratorPattern.decorator.SugarDecorator;

public class DecoratorPatternDemo {
  public static void main(String[] args){
      System.out.println("Decorator Design Pattern Sample");

      Coffee coffee = new PlainCoffee();
      System.out.println(coffee.description()+" cost: $"+coffee.cost());

      coffee = new MilkDecorator(coffee);
      System.out.println(coffee.description()+" cost: $"+coffee.cost());

      coffee = new SugarDecorator(coffee);
      System.out.println(coffee.description()+" cost: $"+coffee.cost());
  }
}

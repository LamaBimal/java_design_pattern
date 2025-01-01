package com.learning.designpatterns.behavioral.visitor.concrete;

import com.learning.designpatterns.behavioral.visitor.element.Shape;
import com.learning.designpatterns.behavioral.visitor.visitor.Visitor;
// concrete Element class
public class Circle implements Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

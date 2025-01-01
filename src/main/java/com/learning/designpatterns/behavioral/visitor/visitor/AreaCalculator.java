package com.learning.designpatterns.behavioral.visitor.visitor;

import com.learning.designpatterns.behavioral.visitor.concrete.Circle;
import com.learning.designpatterns.behavioral.visitor.concrete.Rectangle;
// concrete visitor class
public class AreaCalculator implements Visitor{
    @Override
    public void visit(Circle circle) {
        double area = Math.PI* Math.pow(circle.getRadius(),2);
        System.out.println("Area of Circle: "+area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getLength()*rectangle.getBreadth();
        System.out.println("Area of rectangle: "+ area);
    }
}

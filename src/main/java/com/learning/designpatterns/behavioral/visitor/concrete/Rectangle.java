package com.learning.designpatterns.behavioral.visitor.concrete;

import com.learning.designpatterns.behavioral.visitor.element.Shape;
import com.learning.designpatterns.behavioral.visitor.visitor.Visitor;
import org.w3c.dom.css.Rect;
// Concrete Element class
public class Rectangle implements Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getLength(){
        return this.length;
    }

    public int getBreadth(){
        return this.breadth;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

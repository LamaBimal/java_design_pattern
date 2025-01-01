package com.learning.designpatterns.behavioral.visitor;

import com.learning.designpatterns.behavioral.visitor.concrete.Circle;
import com.learning.designpatterns.behavioral.visitor.concrete.Rectangle;
import com.learning.designpatterns.behavioral.visitor.element.Shape;
import com.learning.designpatterns.behavioral.visitor.visitor.AreaCalculator;
import com.learning.designpatterns.behavioral.visitor.visitor.Visitor;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        Visitor visitor = new AreaCalculator();
        List<Shape> arrayList = new ArrayList<>();
        arrayList.add(new Rectangle(5,4));
        arrayList.add(new Circle(7));

        for(Shape shape: arrayList){
            shape.accept(visitor);
        }
    }
}

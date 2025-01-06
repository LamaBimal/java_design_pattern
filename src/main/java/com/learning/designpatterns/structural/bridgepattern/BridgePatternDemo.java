package com.learning.designpatterns.structural.bridgepattern;

import com.learning.designpatterns.structural.bridgepattern.abstraction.Circle;
import com.learning.designpatterns.structural.bridgepattern.abstraction.Shape;
import com.learning.designpatterns.structural.bridgepattern.implementer.GreenCircle;
import com.learning.designpatterns.structural.bridgepattern.implementer.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10, new RedCircle());
        Shape greenCircle = new Circle(100,100,10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

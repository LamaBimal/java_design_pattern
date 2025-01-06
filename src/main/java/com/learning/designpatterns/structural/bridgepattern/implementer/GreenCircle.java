package com.learning.designpatterns.structural.bridgepattern.implementer;

// concrete Implementer 2
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: Green, radius: "+radius+", x:"+x+", y:"+y);
    }
}

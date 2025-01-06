package com.learning.designpatterns.structural.bridgepattern.abstraction;

import com.learning.designpatterns.structural.bridgepattern.implementer.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

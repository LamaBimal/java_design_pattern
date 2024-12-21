package com.learning.designpatterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        // create a new Circle Object
        Circle orginialCircle = new Circle(5, "red");
        // cloning the object
        Circle clonedCircle = orginialCircle.clone();
        // update the cloned object parameter
        clonedCircle.setRadius(10);
        clonedCircle.setColor("blue");


        // Display the objects
        System.out.println(orginialCircle.toString());
        System.out.println(clonedCircle.toString());
    }
}

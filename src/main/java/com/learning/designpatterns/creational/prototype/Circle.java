package com.learning.designpatterns.creational.prototype;

public class Circle implements Prototype{

    private int radius;
    private String color;

    public Circle(int r, String c){
        this.radius = r;
        this.color = c;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public Circle clone(){
        try{
            return (Circle) super.clone(); //shallow copy
        }catch (CloneNotSupportedException ex){
            throw  new AssertionError("Cloning failed");
        }
    }

    @Override
    public String toString(){
        return "Circle [ radius "+radius+ " , color ="+color+"]";
    }

}

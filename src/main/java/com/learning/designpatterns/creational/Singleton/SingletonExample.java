package com.learning.designpatterns.creational.Singleton;

public class SingletonExample {

    static SingletonExample instance = new SingletonExample();
    private SingletonExample(){}

    public static SingletonExample getInstance(){
        return instance;
    }

    public void displayMessage(){
        System.out.println(" Displaying Singleton Class Object ");
    }
}

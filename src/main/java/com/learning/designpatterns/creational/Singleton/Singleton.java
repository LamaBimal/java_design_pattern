package com.learning.designpatterns.creational.Singleton;

/***
 *  This SingletonExample class illustrate the example of Singleton design pattern. This class is the singleton
 *  class. The object will create only once during the class initialization.
 *
 */

public class Singleton {

    static Singleton instance = new Singleton();
    // Private constructor refrains to initialization of object by outside of class.
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void displayMessage(){
        System.out.println(" Displaying Singleton Class Object ");
    }
}

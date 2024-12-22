package com.learning.designpatterns.creational.Singleton;

public class SingletonDemo {
    public static void main (String[] args){
        Singleton singletonExample = Singleton.getInstance();
        singletonExample.displayMessage();

        Singleton newInstance = Singleton.getInstance();
        if(singletonExample.hashCode() == newInstance.hashCode()){
            System.out.println(" Same Object found");
        }
    }
}

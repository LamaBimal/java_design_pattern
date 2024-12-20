package com.learning.designpatterns.creational.Singleton;

public class Main {
    public static void main (String[] args){
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.displayMessage();

        SingletonExample newInstance = SingletonExample.getInstance();
        if(singletonExample.hashCode() == newInstance.hashCode()){
            System.out.println(" Same Object found");
        }
    }
}

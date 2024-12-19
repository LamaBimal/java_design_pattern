package com.learning.designpatterns.creational.Singleton;

public class Main {
    public static void main (String[] args){
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.displayMessage();
    }
}

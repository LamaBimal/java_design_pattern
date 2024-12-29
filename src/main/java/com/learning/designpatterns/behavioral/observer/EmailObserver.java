package com.learning.designpatterns.behavioral.observer;

// concrete EmailObserver
public class EmailObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("Email Observer Notification Received: "+ message);
    }
}

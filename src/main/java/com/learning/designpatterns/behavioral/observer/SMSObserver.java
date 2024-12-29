package com.learning.designpatterns.behavioral.observer;

// Concrete SMSObserver class
public class SMSObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("SMS Observer Received Notification: "+ message);
    }
}

package com.learning.designpatterns.behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject();
        EmailObserver emailObserver = new EmailObserver();
        SMSObserver smsObserver = new SMSObserver();

        subject.attach(emailObserver);
        subject.attach(smsObserver);

        subject.notifyObservers("New Message");

        subject.detach(emailObserver);
        subject.notifyObservers("Updated Message");

    }
}

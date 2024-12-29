package com.learning.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject class
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }


    public void notifyObservers(String message){
        for(Observer observer : observerList){
            observer.update(message);
        }
    }
}

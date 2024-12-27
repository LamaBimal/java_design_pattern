package com.learning.designpatterns.behavioral.mementopattern;

public class Originator {
    public String state;

    public void setState(String state){
        System.out.println("Originator Setting state to : "+state);
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveToMemento(){
        System.out.println("Originator: Saving to Memento");
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.getState();
        System.out.println(" Originator: State restored to "+state);
    }
}

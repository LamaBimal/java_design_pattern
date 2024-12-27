package com.learning.designpatterns.behavioral.mementopattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // set and save status
        originator.setState("state1");
        caretaker.saveMemento(originator.saveToMemento());

        //set another status
        originator.setState("state2");
        caretaker.saveMemento(originator.saveToMemento());

        originator.setState("state3");

        //Restore state
        originator.restoreFromMemento(caretaker.getMemento(0));
        originator.restoreFromMemento(caretaker.getMemento(1));
    }
}

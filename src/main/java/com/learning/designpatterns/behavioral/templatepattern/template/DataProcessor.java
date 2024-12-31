package com.learning.designpatterns.behavioral.templatepattern.template;

// abstract class template
public abstract class DataProcessor {
    public final void processData(){
        loadData();
        process();
        saveData();
    }
    //common steps
    private void loadData(){
        System.out.println("Loading data...");
    }

    //abstract method for data processing
    protected abstract void process();

    private void saveData(){
        System.out.println("Saving processed data...");
    }
}

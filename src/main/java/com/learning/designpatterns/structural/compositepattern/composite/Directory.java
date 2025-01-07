package com.learning.designpatterns.structural.compositepattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> componentList = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        componentList.add(component);
    }

    public void removeComponent(FileSystemComponent component){
        componentList.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: "+name);
        for(FileSystemComponent component: componentList){
            component.showDetails();
        }
    }
}

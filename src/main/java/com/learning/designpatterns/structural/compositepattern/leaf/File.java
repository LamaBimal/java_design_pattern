package com.learning.designpatterns.structural.compositepattern.leaf;

import com.learning.designpatterns.structural.compositepattern.composite.FileSystemComponent;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: "+name+", Size: "+size+" KB");
    }
}

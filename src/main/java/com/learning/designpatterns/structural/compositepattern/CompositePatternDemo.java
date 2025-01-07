package com.learning.designpatterns.structural.compositepattern;

import com.learning.designpatterns.structural.compositepattern.composite.Directory;
import com.learning.designpatterns.structural.compositepattern.leaf.File;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("java.txt",500);
        File file2 = new File("oop.txt", 200);

        Directory directory = new Directory("My Docs");
        directory.addComponent(file1);
        directory.addComponent(file2);

        File file3 = new File("ML.txt",300);
        Directory subDirectory = new Directory("My Sub Directory");
        subDirectory.addComponent(file3);

        directory.addComponent(subDirectory);

        directory.showDetails();
    }
}

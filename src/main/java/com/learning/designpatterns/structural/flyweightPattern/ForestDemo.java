package com.learning.designpatterns.structural.flyweightPattern;

import com.learning.designpatterns.structural.flyweightPattern.concrete.ConcreteTreeType;
import com.learning.designpatterns.structural.flyweightPattern.concrete.Tree;
import com.learning.designpatterns.structural.flyweightPattern.flyweight.TreeType;

import java.util.ArrayList;
import java.util.List;

public class ForestDemo {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture){
        TreeType treeType = ConcreteTreeType.getTreeType(name,color,texture);
        trees.add(new Tree(x,y,treeType));
    }

    public void draw(){
        for (Tree tree: trees){
            tree.draw();
        }
    }

    public static void main(String[] args){
        ForestDemo forest = new ForestDemo();
        forest.plantTree(1,2, "Oak","Green","Rough");
        forest.plantTree(3,4, "Pine","DarkGreen","Smooth");
        forest.plantTree(5,6, "Oak","Green","Rough");

        forest.draw();
    }
}

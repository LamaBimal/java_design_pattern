package com.learning.designpatterns.structural.flyweightPattern.concrete;

import com.learning.designpatterns.structural.flyweightPattern.flyweight.TreeType;

public class Tree {
    private int x;
    private int y;
    TreeType treeType;

    public Tree(int x, int y, TreeType treeType){
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(){
        treeType.draw(x,y);
    }
}

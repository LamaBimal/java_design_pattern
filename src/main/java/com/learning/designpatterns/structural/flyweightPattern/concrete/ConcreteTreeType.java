package com.learning.designpatterns.structural.flyweightPattern.concrete;

import com.learning.designpatterns.structural.flyweightPattern.flyweight.TreeType;

import java.util.HashMap;
import java.util.Map;

public class ConcreteTreeType implements TreeType {

    private final String name;
    private final String color;
    private final String texture;

    public ConcreteTreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    private static final Map<String,ConcreteTreeType> treeTypes = new HashMap<>();

    public static ConcreteTreeType getTreeType(String name, String color, String texture){
        String key = name+"-"+color+"-"+texture;

        if(!treeTypes.containsKey(key)){
            treeTypes.put(key, new ConcreteTreeType(name,color,texture));
        }
        return treeTypes.get(key);
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing "+ name +" tree at ("+x+","+y+") with color"+color+" and texture "+texture);
    }
}

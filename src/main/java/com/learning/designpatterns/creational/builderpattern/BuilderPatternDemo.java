package com.learning.designpatterns.creational.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .withTitle("Java Builder Pattern")
                .withText("Demo Example For Java Builder Pattern")
                .withCategory("Creational Design Pattern")
                .build();
        post.display();
    }
}

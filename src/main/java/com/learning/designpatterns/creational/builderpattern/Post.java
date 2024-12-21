package com.learning.designpatterns.creational.builderpattern;

public class Post {
    private final String title;
    private final String text;
    private final String category;

    Post(Builder builder){
        this.title = builder.title;
        this.text = builder.text;
        this.category = builder.category;
    }

    public static class Builder{
        private String title;
        private String text;
        private String category;

        public Builder withTitle(String title){
            this.title = title;
            return this;
        }

        public Builder withText(String text){
            this.text = text;
            return this;
        }

        public Builder withCategory(String category){
            this.category = category;
            return this;
        }

        public Post build(){
            return new Post(this);
        }
    }

    public void display(){
        System.out.println(" Title : "+this.title);
        System.out.println(" Text : "+this.text);
        System.out.println(" Category : "+this.category);
    }
}

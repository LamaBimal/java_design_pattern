package com.learning.designpatterns.behavioral.chainofresponsibility;

public class Request {
    private Priority priority;

    public Request(Priority priority){
        this.priority = priority;
    }

    public Priority getPriority(){
        return this.priority;
    }
}

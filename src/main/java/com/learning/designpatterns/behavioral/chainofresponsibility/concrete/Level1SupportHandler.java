package com.learning.designpatterns.behavioral.chainofresponsibility.concrete;

import com.learning.designpatterns.behavioral.chainofresponsibility.Priority;
import com.learning.designpatterns.behavioral.chainofresponsibility.Request;
import com.learning.designpatterns.behavioral.chainofresponsibility.SupportHandler;

// concrete class
public class Level1SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority()== Priority.BASIC){
            System.out.println(" Level1 support handle the request");
        } else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler next) {
        this.nextHandler = next;
    }
}

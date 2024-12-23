package com.learning.designpatterns.behavioral.chainofresponsibility.concrete;

import com.learning.designpatterns.behavioral.chainofresponsibility.Priority;
import com.learning.designpatterns.behavioral.chainofresponsibility.Request;
import com.learning.designpatterns.behavioral.chainofresponsibility.SupportHandler;

public class Level2SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE){
            System.out.println(" Level2 Support handler available");
        } else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler next) {
        this.nextHandler = next;
    }
}

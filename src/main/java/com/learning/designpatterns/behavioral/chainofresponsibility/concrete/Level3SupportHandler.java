package com.learning.designpatterns.behavioral.chainofresponsibility.concrete;

import com.learning.designpatterns.behavioral.chainofresponsibility.Priority;
import com.learning.designpatterns.behavioral.chainofresponsibility.Request;
import com.learning.designpatterns.behavioral.chainofresponsibility.SupportHandler;

// final concrete class.
public class Level3SupportHandler implements SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.CRITICAL){
            System.out.println("Level3 Support Handler found");
        }
    }

    @Override
    public void setNextHandler(SupportHandler next) {
        // no any handler found.
    }
}

package com.learning.designpatterns.behavioral.chainofresponsibility;

import com.learning.designpatterns.behavioral.chainofresponsibility.concrete.Level1SupportHandler;
import com.learning.designpatterns.behavioral.chainofresponsibility.concrete.Level2SupportHandler;
import com.learning.designpatterns.behavioral.chainofresponsibility.concrete.Level3SupportHandler;

// This illustrates the basic example for chain of responsibility.
public class Demo {
    public static void main(String[] args) {

        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request = new Request(Priority.INTERMEDIATE);
        level1Handler.handleRequest(request);
    }
}

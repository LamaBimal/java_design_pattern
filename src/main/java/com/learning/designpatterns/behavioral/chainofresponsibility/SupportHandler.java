package com.learning.designpatterns.behavioral.chainofresponsibility;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler next);
}

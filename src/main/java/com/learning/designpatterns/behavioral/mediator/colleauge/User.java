package com.learning.designpatterns.behavioral.mediator.colleauge;

import com.learning.designpatterns.behavioral.mediator.mediator.ChatMediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String receiveMessage);
    public abstract void receive(String message);
}

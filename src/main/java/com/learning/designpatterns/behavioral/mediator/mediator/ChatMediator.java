package com.learning.designpatterns.behavioral.mediator.mediator;

import com.learning.designpatterns.behavioral.mediator.colleauge.User;

//Mediator Interface
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

package com.learning.designpatterns.behavioral.mediator.colleauge;

import com.learning.designpatterns.behavioral.mediator.mediator.ChatMediator;

// concrete class
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name){
        super(mediator,name);
    }

    @Override
    public void send(String receiveMessage) {
        System.out.println(this.name + " sends : "+receiveMessage);
        mediator.sendMessage(receiveMessage, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name +" receives :"+ message);
    }
}

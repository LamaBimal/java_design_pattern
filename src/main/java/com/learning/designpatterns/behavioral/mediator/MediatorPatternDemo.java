package com.learning.designpatterns.behavioral.mediator;

import com.learning.designpatterns.behavioral.mediator.colleauge.ChatUser;
import com.learning.designpatterns.behavioral.mediator.colleauge.User;
import com.learning.designpatterns.behavioral.mediator.mediator.ChatMediator;
import com.learning.designpatterns.behavioral.mediator.mediator.chatRoom;

public class MediatorPatternDemo {
    public static void main(String[] args) {

        ChatMediator mediator = new chatRoom();
        User user1 = new ChatUser(mediator,"Bimal");
        User user2 = new ChatUser(mediator, "Hari");
        User user3 = new ChatUser(mediator, "Ramesh");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone!");
        user2.send("Hi");
    }
}

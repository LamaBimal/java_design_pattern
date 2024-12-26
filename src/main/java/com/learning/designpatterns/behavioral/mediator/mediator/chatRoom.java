package com.learning.designpatterns.behavioral.mediator.mediator;

import com.learning.designpatterns.behavioral.mediator.colleauge.User;

import java.util.ArrayList;
import java.util.List;

public class chatRoom implements ChatMediator {

    public List<User> userList;

    public chatRoom(){
        this.userList = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for(User user : userList){
            if(user != sender){
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}

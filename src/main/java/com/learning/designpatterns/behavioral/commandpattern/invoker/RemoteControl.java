package com.learning.designpatterns.behavioral.commandpattern.invoker;

import com.learning.designpatterns.behavioral.commandpattern.Command;

// sender
public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}

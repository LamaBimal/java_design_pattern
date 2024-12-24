package com.learning.designpatterns.behavioral.commandpattern.concrete;

import com.learning.designpatterns.behavioral.commandpattern.Command;
import com.learning.designpatterns.behavioral.commandpattern.receiver.Light;

//concrete class
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

package com.learning.designpatterns.behavioral.commandpattern.concrete;

import com.learning.designpatterns.behavioral.commandpattern.Command;
import com.learning.designpatterns.behavioral.commandpattern.receiver.Light;

// concrete class
public class TurnOffLightCommand implements Command {
    public Light light;
    public TurnOffLightCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.turnOff();
    }
}

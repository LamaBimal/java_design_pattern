package com.learning.designpatterns.behavioral.commandpattern;

import com.learning.designpatterns.behavioral.commandpattern.concrete.TurnOffLightCommand;
import com.learning.designpatterns.behavioral.commandpattern.concrete.TurnOnLightCommand;
import com.learning.designpatterns.behavioral.commandpattern.invoker.RemoteControl;
import com.learning.designpatterns.behavioral.commandpattern.receiver.Light;

public class CommandPatternDemo {
    public static void main(String[] args) {

        // Receiver
        Light livingRoom = new Light();

        // commands
        Command turnOffCommand = new TurnOffLightCommand(livingRoom);
        Command turnOnCommand = new TurnOnLightCommand(livingRoom);

        //Invoker
        RemoteControl remoteControl = new RemoteControl();

        //Turn on the light
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
        // Turn off the light

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}

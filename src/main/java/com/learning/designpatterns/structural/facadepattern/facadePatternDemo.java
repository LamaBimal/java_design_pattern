package com.learning.designpatterns.structural.facadepattern;

import com.learning.designpatterns.structural.facadepattern.facade.HomeAutomationFacade;
import com.learning.designpatterns.structural.facadepattern.subsystem.Light;
import com.learning.designpatterns.structural.facadepattern.subsystem.MusicSystem;
import com.learning.designpatterns.structural.facadepattern.subsystem.TV;

public class facadePatternDemo {
    public static void main(String[] args) {
        HomeAutomationFacade homeAutomationFacade = new HomeAutomationFacade(new Light(), new TV(),new MusicSystem());
        homeAutomationFacade.turnOnEverything();
        homeAutomationFacade.turnOffEverything();
    }
}

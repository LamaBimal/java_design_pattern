package com.learning.designpatterns.structural.facadepattern.facade;

import com.learning.designpatterns.structural.facadepattern.subsystem.Light;
import com.learning.designpatterns.structural.facadepattern.subsystem.MusicSystem;
import com.learning.designpatterns.structural.facadepattern.subsystem.TV;

public class HomeAutomationFacade {
    private Light light;
    private TV tv;
    private MusicSystem musicSystem;

    public HomeAutomationFacade(Light light, TV tv, MusicSystem musicSystem){
        this.light = light;
        this.tv = tv;
        this.musicSystem = musicSystem;
    }

    public void turnOnEverything(){
        this.light.turnOn();
        this.tv.turnOn();
        this.musicSystem.turnOn();
        System.out.println("All System are ON");
    }

    public void turnOffEverything(){
        this.light.turnOff();
        this.tv.turnOff();
        this.musicSystem.turnOff();
        System.out.println("All System are Off");
    }


}

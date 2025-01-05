package com.learning.designpatterns.structural.adapaterpattern.adapter;

import com.learning.designpatterns.structural.adapaterpattern.target.Charger;
import com.learning.designpatterns.structural.adapaterpattern.adaptee.OldCharger;

public class ChargerAdapter implements Charger {
    private OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger){
        this.oldCharger = oldCharger;
    }
    @Override
    public void chargeWithUSBTypeC() {
        System.out.println("Adapting for the USB Type C");
        oldCharger.chargeWithMicroUSB();
    }
}

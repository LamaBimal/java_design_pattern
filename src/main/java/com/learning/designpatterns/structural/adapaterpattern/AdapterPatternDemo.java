package com.learning.designpatterns.structural.adapaterpattern;

import com.learning.designpatterns.structural.adapaterpattern.adaptee.OldCharger;
import com.learning.designpatterns.structural.adapaterpattern.adapter.ChargerAdapter;
import com.learning.designpatterns.structural.adapaterpattern.target.Charger;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        Charger charger = new ChargerAdapter(oldCharger);
        charger.chargeWithUSBTypeC();
    }
}

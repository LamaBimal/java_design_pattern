package com.learning.designpatterns.behavioral.statepattern.concrete;

import com.learning.designpatterns.behavioral.statepattern.context.VendingMachine;
import com.learning.designpatterns.behavioral.statepattern.state.State;

public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {

    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Select Product. Dispensing Product now ...");
        machine.setCurrentState(new DispensingState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {

    }
}

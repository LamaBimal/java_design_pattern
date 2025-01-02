package com.learning.designpatterns.behavioral.statepattern.concrete;

import com.learning.designpatterns.behavioral.statepattern.context.VendingMachine;
import com.learning.designpatterns.behavioral.statepattern.state.State;

public class DispensingState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {

    }

    @Override
    public void selectProduct(VendingMachine machine) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Product has been dispensed. Returning to Idle State");
        machine.setCurrentState(new IdleState());
    }
}

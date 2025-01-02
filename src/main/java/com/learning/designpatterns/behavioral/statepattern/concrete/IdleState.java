package com.learning.designpatterns.behavioral.statepattern.concrete;

import com.learning.designpatterns.behavioral.statepattern.context.VendingMachine;
import com.learning.designpatterns.behavioral.statepattern.state.State;

public class IdleState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Machine is in Idle State. Insert Money");
        machine.setCurrentState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {

    }

    @Override
    public void dispenseProduct(VendingMachine machine) {

    }
}

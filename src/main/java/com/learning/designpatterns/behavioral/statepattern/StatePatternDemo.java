package com.learning.designpatterns.behavioral.statepattern;

import com.learning.designpatterns.behavioral.statepattern.context.VendingMachine;

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.insertMoney();
        machine.selectProduct();
        machine.dispenseProduct();
    }
}

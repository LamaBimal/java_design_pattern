package com.learning.designpatterns.behavioral.statepattern.state;

import com.learning.designpatterns.behavioral.statepattern.context.VendingMachine;

// state interface
public interface State {
    void insertMoney(VendingMachine machine);
    void selectProduct(VendingMachine machine);
    void dispenseProduct(VendingMachine machine);
}

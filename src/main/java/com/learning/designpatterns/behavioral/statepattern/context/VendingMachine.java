package com.learning.designpatterns.behavioral.statepattern.context;

import com.learning.designpatterns.behavioral.statepattern.concrete.IdleState;
import com.learning.designpatterns.behavioral.statepattern.state.State;

public class VendingMachine {
    private State state;

    public VendingMachine(){
        this.state = new IdleState();
    }

    public void setCurrentState(State state){
        this.state = state;
    }

    public void insertMoney(){
        this.state.insertMoney(this);
    }

    public void selectProduct(){
        this.state.selectProduct(this);
    }

    public void dispenseProduct(){
        this.state.dispenseProduct(this);
    }

}

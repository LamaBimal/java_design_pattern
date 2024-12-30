package com.learning.designpatterns.behavioral.strategypattern.concrete;

import com.learning.designpatterns.behavioral.strategypattern.DiscountStrategy;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price *0.7; // 30% discount
    }
}

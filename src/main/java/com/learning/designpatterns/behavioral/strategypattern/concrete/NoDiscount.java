package com.learning.designpatterns.behavioral.strategypattern.concrete;

import com.learning.designpatterns.behavioral.strategypattern.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // no discount available.
    }
}

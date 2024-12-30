package com.learning.designpatterns.behavioral.strategypattern.concrete;

import com.learning.designpatterns.behavioral.strategypattern.DiscountStrategy;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price*0.8; // 20% discount.
    }
}

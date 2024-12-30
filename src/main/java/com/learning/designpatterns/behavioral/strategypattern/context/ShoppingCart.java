package com.learning.designpatterns.behavioral.strategypattern.context;

import com.learning.designpatterns.behavioral.strategypattern.DiscountStrategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    // calculate final price
    public double calculatePrice(double price){
        return discountStrategy.applyDiscount(price);
    }
}

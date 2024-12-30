package com.learning.designpatterns.behavioral.strategypattern;

import com.learning.designpatterns.behavioral.strategypattern.concrete.NoDiscount;
import com.learning.designpatterns.behavioral.strategypattern.concrete.RegularDiscount;
import com.learning.designpatterns.behavioral.strategypattern.concrete.VIPDiscount;
import com.learning.designpatterns.behavioral.strategypattern.context.ShoppingCart;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        double price = 100.0;

        //using No discount
        ShoppingCart shoppingCart = new ShoppingCart(new NoDiscount());
        System.out.println(" Price for No discount "+shoppingCart.calculatePrice(price));

        // using Regular Discount
        shoppingCart.setDiscountStrategy(new RegularDiscount());
        System.out.println(" Price after Regular Discount "+shoppingCart.calculatePrice(price));

        // using VIP Discount
        shoppingCart.setDiscountStrategy(new VIPDiscount());
        System.out.println(" Price after VIP Discount "+shoppingCart.calculatePrice(price));
    }
}

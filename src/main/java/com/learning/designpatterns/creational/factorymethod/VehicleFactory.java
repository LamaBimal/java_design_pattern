package com.learning.designpatterns.creational.factorymethod;

import com.learning.designpatterns.exception.UnsupportedTypeException;

/**
 *  This factory class provides the object of class.
 */

public class VehicleFactory {

    // This function creates the instance of class based on the type parameter.
    public static Vehicle getInstance(String type) throws UnsupportedTypeException{
        return switch (type) {
            case "car" -> new Car();
            case "truck" -> new Truck();
            default -> {
                throw new UnsupportedTypeException(" Vehicle Type " + type + " is not supported");
            }
        };
    }
}

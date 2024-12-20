package com.learning.designpatterns.creational.factorymethod;

/**
 * This Main class illustrates the example of factoryDesign Pattern.
 */
public class Main {
    public static void main(String[] args) {
        try{
            Vehicle vehicle = VehicleFactory.getInstance("car");
            vehicle.run();
            Vehicle truck = VehicleFactory.getInstance("truck");
            truck.run();
            Vehicle bus = VehicleFactory.getInstance("bus");
            bus.run();
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}

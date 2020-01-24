package com.rahul.designpatterns.gof.creational.simplefactory;

import com.rahul.designpatterns.pojo.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleFactory.Type.CAR);
        System.out.println("Vehicle1: " + vehicle1);

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleFactory.Type.MOTORBIKE);
        System.out.println("Vehicle2: " + vehicle2);
    }
}

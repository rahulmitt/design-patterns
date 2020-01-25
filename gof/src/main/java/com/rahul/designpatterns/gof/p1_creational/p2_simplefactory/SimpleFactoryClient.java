package com.rahul.designpatterns.gof.p1_creational.p2_simplefactory;

import com.rahul.designpatterns.pojo.Vehicle;

/*
    Simple factory can use other design patterns like builder to construct objects

    Examples of simple-factory in JDK
        1. The getInstance() method of java.text.NumberFormat class
*/
public class SimpleFactoryClient {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle(VehicleFactory.Type.CAR);
        System.out.println("Vehicle1: " + vehicle1);

        Vehicle vehicle2 = VehicleFactory.createVehicle(VehicleFactory.Type.MOTORBIKE);
        System.out.println("Vehicle2: " + vehicle2);
    }
}

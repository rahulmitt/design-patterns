package com.rahul.designpatterns.gof.p1_creational.p2_simplefactory;

import com.rahul.designpatterns.pojo.Car;
import com.rahul.designpatterns.pojo.Motorbike;
import com.rahul.designpatterns.pojo.Vehicle;

/*
    Simple factory can use other design patterns like builder to construct objects

    Examples of simple-factory in JDK
        1. The getInstance() method of java.text.NumberFormat class
*/
public class VehicleFactory {
    public enum Type {
        CAR, MOTORBIKE
    }

    public static Vehicle createVehicle(Type type) {
        switch (type) {
            case CAR:
                return new Car();

            case MOTORBIKE:
                return new Motorbike();

            default:
                throw new IllegalArgumentException("Vehicle type is unknown");
        }
    }
}

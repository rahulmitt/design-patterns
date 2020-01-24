package com.rahul.designpatterns.gof.creational.simplefactory;

import com.rahul.designpatterns.pojo.Car;
import com.rahul.designpatterns.pojo.Motorbike;
import com.rahul.designpatterns.pojo.Vehicle;

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

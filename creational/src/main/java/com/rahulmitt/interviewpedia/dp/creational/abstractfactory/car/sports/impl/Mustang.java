package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;

public class Mustang implements AbstractSportsCar {
    @Override
    public void driveFast() {
        System.out.println("Mustang.driveFast() called.");
    }
}

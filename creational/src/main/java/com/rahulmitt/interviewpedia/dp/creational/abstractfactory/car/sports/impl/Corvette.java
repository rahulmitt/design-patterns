package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;

public class Corvette implements AbstractSportsCar {
    @Override
    public void driveFast() {
        System.out.println("Corvette.driveFast() called.");
    }
}

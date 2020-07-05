package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;

public class Focus implements AbstractEconomyCar {
    public void driveSlow() {
        System.out.println("Focus.driveSlow() called.");
    }
}

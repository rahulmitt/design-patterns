package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;

public class Cavalier implements AbstractEconomyCar {
    @Override
    public void driveSlow() {
        System.out.println("Cavalier.driveSlow() called.");
    }
}

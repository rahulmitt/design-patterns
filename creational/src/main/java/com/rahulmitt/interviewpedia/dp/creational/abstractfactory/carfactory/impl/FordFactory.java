package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.impl.Focus;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.impl.Mustang;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.CarAbstractFactory;

public class FordFactory implements CarAbstractFactory {
    public AbstractSportsCar createSportsCar() {
        return new Mustang();
    }

    public AbstractEconomyCar createEconomyCar() {
        return new Focus();
    }
}

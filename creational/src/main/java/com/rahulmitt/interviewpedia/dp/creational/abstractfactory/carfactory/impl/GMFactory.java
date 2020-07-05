package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.impl;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.impl.Cavalier;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.impl.Corvette;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.CarAbstractFactory;

public class GMFactory implements CarAbstractFactory {
    public AbstractSportsCar createSportsCar() {
        return new Corvette();
    }

    public AbstractEconomyCar createEconomyCar() {
        return new Cavalier();
    }
}

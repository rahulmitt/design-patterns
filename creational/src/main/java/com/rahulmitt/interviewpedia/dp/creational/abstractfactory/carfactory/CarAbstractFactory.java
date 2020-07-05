package com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;

public interface CarAbstractFactory {
    AbstractSportsCar createSportsCar();
    AbstractEconomyCar createEconomyCar();
}

package com.rahulmitt.interviewpedia.dp.creational.abstractfactory;

import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.CarAbstractFactory;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.impl.FordFactory;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.carfactory.impl.GMFactory;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.economy.AbstractEconomyCar;
import com.rahulmitt.interviewpedia.dp.creational.abstractfactory.car.sports.AbstractSportsCar;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        CarAbstractFactory factoryOne = new FordFactory();
        AbstractSportsCar car1 = factoryOne.createSportsCar();
        AbstractEconomyCar car2 = factoryOne.createEconomyCar();

        CarAbstractFactory factoryTwo = new GMFactory();
        AbstractSportsCar car3 = factoryTwo.createSportsCar();
        AbstractEconomyCar car4 = factoryTwo.createEconomyCar();

        car1.driveFast();
        car2.driveSlow();
        car3.driveFast();
        car4.driveSlow();
    }
}

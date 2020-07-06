package com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.impl;

import com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.CarAbstraction;
import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.Implementor;
import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.impl.SportsCarImplementor;

public class SportsCar implements CarAbstraction {
    Implementor implementor = new SportsCarImplementor();

    public SportsCar() {
        System.out.println("SportsCar constructed.");
    }

    @Override
    public void action() {
        implementor.actionImplemented();
    }
}

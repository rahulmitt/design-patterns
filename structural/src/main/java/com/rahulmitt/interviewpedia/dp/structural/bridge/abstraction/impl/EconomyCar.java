package com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.impl;

import com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.CarAbstraction;
import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.Implementor;
import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.impl.EconomyCarImplementor;

public class EconomyCar implements CarAbstraction {
    Implementor implementor = new EconomyCarImplementor();

    public EconomyCar() {
        System.out.println("EconomyCar constructed.");
    }

    @Override
    public void action() {
        implementor.actionImplemented();
    }
}

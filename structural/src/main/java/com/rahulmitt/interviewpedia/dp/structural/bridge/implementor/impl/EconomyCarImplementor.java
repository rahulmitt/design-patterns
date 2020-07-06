package com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.impl;

import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.Implementor;

public class EconomyCarImplementor implements Implementor {
    public EconomyCarImplementor() {
        System.out.println("EconomyCarImplementor constructed.");
    }

    @Override
    public void actionImplemented() {
        System.out.println("EconomyCarImplementor.actionImplemented() called.");
    }
}

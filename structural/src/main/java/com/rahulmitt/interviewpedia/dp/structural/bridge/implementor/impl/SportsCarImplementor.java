package com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.impl;

import com.rahulmitt.interviewpedia.dp.structural.bridge.implementor.Implementor;

public class SportsCarImplementor implements Implementor {
    public SportsCarImplementor() {
        System.out.println("SportsCarImplementor constructed.");
    }

    @Override
    public void actionImplemented() {
        System.out.println("SportsCarImplementor.actionImplemented() called.");
    }
}

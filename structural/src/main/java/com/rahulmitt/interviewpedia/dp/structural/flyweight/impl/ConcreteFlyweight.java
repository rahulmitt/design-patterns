package com.rahulmitt.interviewpedia.dp.structural.flyweight.impl;

import com.rahulmitt.interviewpedia.dp.structural.flyweight.Flyweight;
import com.rahulmitt.interviewpedia.dp.structural.flyweight.State;

public class ConcreteFlyweight implements Flyweight {

    private boolean state;

    public ConcreteFlyweight(State state) {
        this.state = state.getState();
    }

    @Override
    public void action(State state) {
        System.out.println("ConcreteFlyweight.action(" + state.getState() + ") called.");
        this.state = state.getState();
        System.out.println("ConcreteFlyweight.state = " + this.state);
    }
}

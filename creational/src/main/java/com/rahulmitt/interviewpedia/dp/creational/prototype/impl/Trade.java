package com.rahulmitt.interviewpedia.dp.creational.prototype.impl;

import com.rahulmitt.interviewpedia.dp.creational.prototype.Prototype;

public class Trade implements Prototype<Trade> {
    public Trade() {
        System.out.println("Trade constructed.");
    }

    public Trade getClone() {
        // if required, put deep copy code here
        return new Trade();
    }

    public void execute() {
        System.out.println("Trade.execute() called");
    }
}

package com.rahulmitt.interviewpedia.dp.structural.decorator.impl;

import com.rahulmitt.interviewpedia.dp.structural.decorator.Component;

public class ConcreteComponent implements Component {
    public void action() {
        System.out.println("ConcreteComponent.action() called.");
    }
}

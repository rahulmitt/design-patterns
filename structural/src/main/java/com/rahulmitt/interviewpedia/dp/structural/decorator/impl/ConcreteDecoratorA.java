package com.rahulmitt.interviewpedia.dp.structural.decorator.impl;

public class ConcreteDecoratorA extends Decorator {
    String addedVariable;

    @Override
    public void action() {
        super.action();
        System.out.println("ConcreteDecoratorA.action() called.");
        addedVariable = "extra";
        System.out.println("ConcreteDecoratorA.addedVariable=" + addedVariable);
    }
}

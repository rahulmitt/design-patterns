package com.rahulmitt.interviewpedia.dp.structural.decorator.impl;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void action() {
        super.action();
        System.out.println("ConcreteDecoratorB.action() called.");
        addedMethod();
    }

    private void addedMethod() {
        System.out.println("ConcreteDecoratorB.addedMethod() called.");
    }
}

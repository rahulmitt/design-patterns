package com.rahulmitt.interviewpedia.dp.structural.decorator;

import com.rahulmitt.interviewpedia.dp.structural.decorator.impl.ConcreteDecoratorA;
import com.rahulmitt.interviewpedia.dp.structural.decorator.impl.ConcreteDecoratorB;

public class DecoratorMain {
    public static void main(String[] args) {
        Component decorated1 = new ConcreteDecoratorA();
        decorated1.action();

        Component decorated2 = new ConcreteDecoratorB();
        decorated2.action();
    }
}

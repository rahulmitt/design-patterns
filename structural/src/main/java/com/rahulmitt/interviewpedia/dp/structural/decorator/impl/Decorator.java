package com.rahulmitt.interviewpedia.dp.structural.decorator.impl;

import com.rahulmitt.interviewpedia.dp.structural.decorator.Component;

public class Decorator implements Component {
    Component component = new ConcreteComponent();

    @Override
    public void action() {
        component.action();
    }
}

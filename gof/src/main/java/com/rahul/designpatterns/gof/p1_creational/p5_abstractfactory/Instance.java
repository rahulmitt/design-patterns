package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Represents an abstract PRODUCT
public interface Instance {
    enum Capacity { MICRO, SMALL, LARGE }

    void start();
    void stop();
    void attachStorage(Storage storage);
}

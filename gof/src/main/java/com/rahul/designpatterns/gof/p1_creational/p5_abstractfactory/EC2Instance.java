package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Represents a concrete product in a family - AWS
public class EC2Instance implements Instance {
    private Capacity capacity;

    public EC2Instance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("EC2Instance created");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance started");
    }

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to EC2Instance");
    }
}

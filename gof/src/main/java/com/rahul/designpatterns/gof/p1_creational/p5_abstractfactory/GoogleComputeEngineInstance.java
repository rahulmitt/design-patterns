package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Represents a concrete product in a family - Google Cloud Platform
public class GoogleComputeEngineInstance implements Instance {
    private Capacity capacity;

    public GoogleComputeEngineInstance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Google compute engine created");
    }

    @Override
    public void start() {
        System.out.println("Google compute engine started");
    }

    @Override
    public void stop() {
        System.out.println("Google compute engine stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google compute engine");
    }
}

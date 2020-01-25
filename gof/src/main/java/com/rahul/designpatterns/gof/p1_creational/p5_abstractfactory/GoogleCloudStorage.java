package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Represents a concrete product in a family - Google Cloud Platform
public class GoogleCloudStorage implements Storage {
    int capacityInMb;

    public GoogleCloudStorage(int capacityInMb) {
        this.capacityInMb = capacityInMb;
        System.out.println("GoogleCloudStorage created");
    }

    @Override
    public String getId() {
        return "GCPS-1";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage: " + getId();
    }
}

package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Represents a concrete product in a family - AWS
public class S3Storage implements Storage {
    int capacityInMb;

    public S3Storage(int capacityInMb) {
        this.capacityInMb = capacityInMb;
        System.out.println("S3Storage created");
    }

    @Override
    public String getId() {
        return "S3-1";
    }

    @Override
    public String toString() {
        return "S3 Storage: " + getId();
    }
}

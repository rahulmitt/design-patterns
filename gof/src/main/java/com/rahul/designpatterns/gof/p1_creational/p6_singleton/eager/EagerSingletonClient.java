package com.rahul.designpatterns.gof.p1_creational.p6_singleton.eager;

public class EagerSingletonClient {
    public static void main(String[] args) {
        EagerRegistry instance1 = EagerRegistry.getInstance();
        EagerRegistry instance2 = EagerRegistry.getInstance();
        System.out.println("Is singeton? " + (instance1 == instance2));

    }
}

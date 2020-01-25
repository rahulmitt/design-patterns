package com.rahul.designpatterns.gof.p1_creational.p6_singleton.eager;

// This class uses eager initialization of singleton instance
public class EagerRegistry {

    private static final EagerRegistry instance = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return instance;
    }
}

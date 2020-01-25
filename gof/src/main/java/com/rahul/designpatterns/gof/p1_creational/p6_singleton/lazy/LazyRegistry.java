package com.rahul.designpatterns.gof.p1_creational.p6_singleton.lazy;

/*
    1. Uses double-ckecked locking
    2. Uses volatile
*/
public class LazyRegistry {

    private static volatile LazyRegistry instance;

    private LazyRegistry() {
    }

    public static LazyRegistry getInstance() {
        if(instance == null) {
            synchronized(LazyRegistry.class) {
                if(instance == null) {
                    instance = new LazyRegistry();
                }
            }
        }

        return instance;
    }
}

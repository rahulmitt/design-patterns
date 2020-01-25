package com.rahul.designpatterns.gof.p1_creational.p6_singleton.lazy;

public class LazySingletonClient {
    public static void main(String[] args) {
        LazyRegistry instance1 = LazyRegistry.getInstance();
        LazyRegistry instance2 = LazyRegistry.getInstance();
        System.out.println("Is singleton? " + (instance1 == instance2));
    }
}

package com.rahulmitt.interviewpedia.dp.structural.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("key1");
        System.out.println("Call flyweight action with state=false");
        State stateF = new State(false);
        flyweight1.action(stateF);

        Flyweight flyweight2 = FlyweightFactory.getFlyweight("key1");
        System.out.println("Call flyweight action with state=true");
        State stateT = new State(true);
        flyweight2.action(stateT);
    }
}

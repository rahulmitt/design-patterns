package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

/*
    Provides implementation for creating JSON messages
*/
public class JsonMessageFactory extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}

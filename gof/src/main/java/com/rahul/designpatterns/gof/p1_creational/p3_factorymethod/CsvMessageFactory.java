package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

public class CsvMessageFactory extends MessageCreator {

    @Override
    public Message createMessage() {
        return new CsvMessage();
    }
}

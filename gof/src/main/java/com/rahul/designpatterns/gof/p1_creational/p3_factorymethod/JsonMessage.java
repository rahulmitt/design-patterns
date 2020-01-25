package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

public class JsonMessage extends Message {

    @Override
    public String getText() {
        return "{ \"JSON\" : [] }";
    }
}

package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

/*
    This class represents interface for our PRODUCT which is a message
    Implementations will be specific to content type
*/
public abstract class Message {
    public abstract String getText();

    // adds some default headers
    public void addDefaultHeaders() {

    }

    // encrypt the content
    public void encrypt() {

    }
}

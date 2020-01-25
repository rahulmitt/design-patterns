package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

/*
    This is our abstract CREATOR
    The abstract method createMessage() has to be implemented by its subclass
*/
public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    // Factory method
    public abstract Message createMessage();
}

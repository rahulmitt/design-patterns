package com.rahul.designpatterns.gof.p1_creational.p3_factorymethod;

/*
    In a factory-method design pattern, the base class defines the factory method
    And a subclass provide a concrete implementation of that method

    Use this design pattern when you want to delegate object instantiation to subclasses

    Examples of factory-method in JDK
        1.  The abstract method iterator() of java.util.Collection class.
            This method is implemented in concrete classes like ArrayList
*/
public class FactoryClient {

    public static void main(String[] args) {
        MessageCreator jsonMessageCreator = new JsonMessageFactory();
        Message jsonMessage = jsonMessageCreator.getMessage();
        System.out.println(jsonMessage.getText());

        MessageCreator csvMessageCreator = new CsvMessageFactory();
        Message textMessage = csvMessageCreator.getMessage();
        System.out.println(textMessage.getText());
    }
}

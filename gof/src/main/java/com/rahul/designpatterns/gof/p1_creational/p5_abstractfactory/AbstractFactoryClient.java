package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

/*
    Abstract Factory is used when we have 2 or more objects which work together forming a kit/set
    and there can be multiple kits/sets that can be created by client code

    Steps:
    1. Create abstract factory as an interface
    2. Provide concrete implementations of factories for each set of products

    Abstract factory design pattern uses factory design pattern
        - an abstract factory is an object with multiple factory methods
        - factories can be implemented as Singletons - we typically need only 1 instance of it
        - If product object creation is expensive, we can use prototype design pattern to create concrete products


*/
public class AbstractFactoryClient {
    private ResourceFactory factory;

    public AbstractFactoryClient(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMb) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMb);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        AbstractFactoryClient aws = new AbstractFactoryClient(new AwsResourceFactory());
        Instance awsInstance = aws.createServer(Instance.Capacity.SMALL, 100);
        awsInstance.start();
        awsInstance.stop();

        System.out.println("-----------------------");

        AbstractFactoryClient gcp = new AbstractFactoryClient(new GoogleCloudResourceFactory());
        Instance gcpInstance = gcp.createServer(Instance.Capacity.LARGE, 1000);
        gcpInstance.start();
        gcpInstance.stop();
    }
}

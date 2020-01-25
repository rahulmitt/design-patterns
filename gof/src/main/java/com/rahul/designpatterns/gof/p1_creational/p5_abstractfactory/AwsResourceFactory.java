package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Factory implementation for AWS resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int mb) {
        return new S3Storage(mb);
    }
}

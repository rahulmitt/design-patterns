package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

// Factory implementation for Google-Cloud resources
public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int mb) {
        return new GoogleCloudStorage(mb);
    }
}

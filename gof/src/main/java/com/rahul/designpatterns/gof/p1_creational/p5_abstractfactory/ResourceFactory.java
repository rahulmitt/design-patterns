package com.rahul.designpatterns.gof.p1_creational.p5_abstractfactory;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int mb);
}

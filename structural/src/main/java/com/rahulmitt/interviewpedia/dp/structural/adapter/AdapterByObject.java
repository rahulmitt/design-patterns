package com.rahulmitt.interviewpedia.dp.structural.adapter;

public class AdapterByObject implements Target {
    private Adaptee adaptee;

    public AdapterByObject() {
        System.out.println("AdapterByObject constructed.");
    }

    @Override
    public String newRequest() {
        if (adaptee == null) adaptee = new Adaptee();
        return adaptee.oldRequest();
    }
}

package com.rahulmitt.interviewpedia.dp.structural.adapter;

public class AdapterByClass extends Adaptee implements Target {

    public AdapterByClass() {
        System.out.println("AdapterByClass constructed.");
    }

    @Override
    public String newRequest() {
        return oldRequest();
    }
}

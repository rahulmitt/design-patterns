package com.rahulmitt.interviewpedia.dp.structural.proxy.impl;

import com.rahulmitt.interviewpedia.dp.structural.proxy.Service;

public class ServiceImpl implements Service {

    public ServiceImpl() {
        System.out.println("Service constructed.");
    }

    @Override
    public void action() {
        System.out.println("Service.action() called.");
    }
}

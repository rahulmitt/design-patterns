package com.rahulmitt.interviewpedia.dp.structural.proxy.impl;

import com.rahulmitt.interviewpedia.dp.structural.proxy.Service;

public class Proxy implements Service {

    private Service service = new ServiceImpl();

    public void action() {
        System.out.println("Proxy activated..");
        service.action();
    }
}

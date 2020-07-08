package com.rahulmitt.interviewpedia.dp.structural.proxy;

import com.rahulmitt.interviewpedia.dp.structural.proxy.impl.Proxy;
import com.rahulmitt.interviewpedia.dp.structural.proxy.impl.ServiceImpl;

public class ProxyMain {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.action();

        Service proxy = new Proxy();
        proxy.action();
    }
}

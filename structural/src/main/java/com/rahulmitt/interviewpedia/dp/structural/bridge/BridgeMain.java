package com.rahulmitt.interviewpedia.dp.structural.bridge;

import com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.CarAbstraction;
import com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.impl.EconomyCar;
import com.rahulmitt.interviewpedia.dp.structural.bridge.abstraction.impl.SportsCar;

public class BridgeMain {
    public static void main(String[] args) {
        CarAbstraction car1 = new SportsCar();
        car1.action();

        CarAbstraction car2 = new EconomyCar();
        car2.action();
    }
}

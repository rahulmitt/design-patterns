package com.rahulmitt.interviewpedia.dp.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Target target1 = new AdapterByClass();
        Target target2 = new AdapterByObject();

        System.out.println("Calling targets...");
        System.out.println("target1.newRequest()->" + target1.newRequest());
        System.out.println("target2.newRequest()->" + target2.newRequest());
    }
}

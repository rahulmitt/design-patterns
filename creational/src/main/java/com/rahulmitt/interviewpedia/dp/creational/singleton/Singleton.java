package com.rahulmitt.interviewpedia.dp.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private int value;

    private Singleton() {
        System.out.println("Singleton constructed.");
    }

    /*
    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
    */

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getInfo() {
        return getClass().getName() +
                ", loaded by " + getClass().getClassLoader() +
                ", id#" + System.identityHashCode(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int parm) {
        value = parm;
    }

    public boolean equals(Singleton that) {
        return (System.identityHashCode(this) == System.identityHashCode(that));
    }
}

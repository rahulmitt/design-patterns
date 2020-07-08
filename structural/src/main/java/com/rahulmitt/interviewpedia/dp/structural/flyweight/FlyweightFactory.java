package com.rahulmitt.interviewpedia.dp.structural.flyweight;

import com.rahulmitt.interviewpedia.dp.structural.flyweight.impl.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, Flyweight> map = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (!map.containsKey(key)) {
            Flyweight flyweight = new ConcreteFlyweight(new State(true));
            map.put(key, flyweight);
        }

        return map.get(key);
    }
}

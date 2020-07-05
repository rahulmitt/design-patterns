package com.rahulmitt.interviewpedia.dp.creational.prototype;

public interface Prototype<T> {
    T getClone(); // as opposed to Object.clone()
}

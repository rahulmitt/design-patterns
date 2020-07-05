package com.rahulmitt.interviewpedia.dp.creational.builder.user.impl;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.User;

public class UserImpl implements User {
    String firstName;
    String lastName;
    Integer age;
    Address address;

    public UserImpl() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

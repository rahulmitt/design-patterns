package com.rahulmitt.interviewpedia.dp.creational.builder.address.impl;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;

public class AddressImpl implements Address {
    String flatNo;
    String building;
    String street;
    String city;
    String country;

    public AddressImpl() {
    }

    @Override
    public String getFlatNo() {
        return flatNo;
    }

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", building='" + building + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

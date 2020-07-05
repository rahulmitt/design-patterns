package com.rahulmitt.interviewpedia.dp.creational.builder.address.impl;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;
import com.rahulmitt.interviewpedia.dp.creational.builder.address.AddressBuilder;

public class AddressBuilderImpl implements AddressBuilder {
    public AddressBuilderImpl() {
    }

    @Override
    public FlatNoStep with() {
        return new Builder();
    }

    private static class Builder implements IBuilder {
        private final AddressImpl address = new AddressImpl();

        @Override
        public BuildingStep flatNo(String flatNo) {
            address.flatNo = flatNo;
            return this;
        }

        @Override
        public StreetStep building(String building) {
            address.building = building;
            return this;
        }

        @Override
        public CityStep street(String street) {
            address.street = street;
            return this;
        }

        @Override
        public CountryStep city(String city) {
            address.city = city;
            return this;
        }

        @Override
        public BuildStep country(String country) {
            address.country = country;
            return this;
        }

        @Override
        public Address build() {
            return address;
        }
    }
}

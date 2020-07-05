package com.rahulmitt.interviewpedia.dp.creational.builder.address;

public interface AddressBuilder {

    FlatNoStep with();

    interface FlatNoStep {
        BuildingStep flatNo(String flatNo);
    }

    interface BuildingStep {
        StreetStep building(String building);
    }

    interface StreetStep {
        CityStep street(String street);
    }

    interface CityStep {
        CountryStep city(String city);
    }

    interface CountryStep {
        BuildStep country(String country);
    }

    interface BuildStep {
        Address build();
    }

    interface IBuilder extends FlatNoStep, BuildingStep, StreetStep, CityStep, CountryStep, BuildStep {

    }
}

package com.rahulmitt.interviewpedia.dp.creational.builder.user;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;

public interface UserBuilder {
    FirstNameStep with();

    interface FirstNameStep {
        LastNameStep firstName(String firstName);
    }

    interface LastNameStep {
        AgeStep lastName(String lastName);
    }

    interface AgeStep {
        AddressStep age(int age);
    }

    interface AddressStep {
        BuildStep address(Address address);
    }

    interface BuildStep {
        User build();
    }

    interface IBuilder extends FirstNameStep, LastNameStep, AgeStep, AddressStep, BuildStep {
    }
}

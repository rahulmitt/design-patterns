package com.rahul.designpatterns.gof.creational.builder;

import com.rahul.designpatterns.gof.creational.builder.pojo.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDtoBuilder implements UserDtoBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto dto;

    @Override
    public UserDtoBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDtoBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDtoBuilder birthday(LocalDate date) {
        int ageInYears = Period.between(date, LocalDate.now()).getYears();
        this.age = Integer.toString(ageInYears);
        return this;
    }

    @Override
    public UserDtoBuilder address(Address address) {
        this.address = address.getHouseNumber() + ", "
                + address.getStreet() + ", "
                + address.getCity() + ", "
                + address.getState() + ", "
                + address.getZipcode();
        return this;
    }

    @Override
    public UserDto build() {
        this.dto = new UserWebDto(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDto getUserDto() {
        return dto;
    }
}

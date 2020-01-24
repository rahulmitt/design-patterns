package com.rahul.designpatterns.gof.creational.builder;

import com.rahul.designpatterns.gof.creational.builder.pojo.Address;

import java.time.LocalDate;

public interface UserDtoBuilder {
    UserDtoBuilder firstName(String firstName);
    UserDtoBuilder lastName(String lastName);
    UserDtoBuilder birthday(LocalDate date);
    UserDtoBuilder address(Address address);
    UserDto build();
    UserDto getUserDto();
}

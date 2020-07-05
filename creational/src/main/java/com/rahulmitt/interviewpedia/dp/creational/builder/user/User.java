package com.rahulmitt.interviewpedia.dp.creational.builder.user;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;

public interface User {
    String getFirstName();

    String getLastName();

    Integer getAge();

    Address getAddress();
}

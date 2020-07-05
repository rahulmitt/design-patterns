package com.rahulmitt.interviewpedia.dp.creational.builder;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;
import com.rahulmitt.interviewpedia.dp.creational.builder.address.AddressBuilder;
import com.rahulmitt.interviewpedia.dp.creational.builder.address.impl.AddressBuilderImpl;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.impl.UserBuilderImpl;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.User;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.UserBuilder;

public class BuilderMain {
    static AddressBuilder addressBuilder = new AddressBuilderImpl();
    static UserBuilder userBuilder = new UserBuilderImpl();

    public static void main(String[] args) {

        Address address1 = addressBuilder.with()
                .flatNo("A56")
                .building("Rustomjee Apartments")
                .street("Goregaon")
                .city("Mumbai")
                .country("India")
                .build();

        User user1 = userBuilder.with()
                .firstName("Rahul")
                .lastName("Mittal")
                .age(37)
                .address(address1)
                .build();

        System.out.println(user1);
    }
}

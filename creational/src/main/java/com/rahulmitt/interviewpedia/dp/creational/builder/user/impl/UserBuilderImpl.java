package com.rahulmitt.interviewpedia.dp.creational.builder.user.impl;

import com.rahulmitt.interviewpedia.dp.creational.builder.address.Address;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.User;
import com.rahulmitt.interviewpedia.dp.creational.builder.user.UserBuilder;

public class UserBuilderImpl implements UserBuilder {
    public UserBuilderImpl() {
    }

    @Override
    public FirstNameStep with() {
        return new Builder();
    }

    private static class Builder implements IBuilder {

        private final UserImpl user = new UserImpl();

        @Override
        public LastNameStep firstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        @Override
        public AgeStep lastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        @Override
        public AddressStep age(int age) {
            user.age = age;
            return this;
        }

        @Override
        public BuildStep address(Address address) {
            user.address = address;
            return this;
        }

        @Override
        public User build() {
            return user;
        }
    }
}

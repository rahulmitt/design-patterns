package com.rahul.designpatterns.gof.p1_creational.p1_builder;

import com.rahul.designpatterns.pojo.Address;

import java.time.LocalDate;
import java.time.Period;

// Product class
public class UserDto {
    private String name;
    private String address;
    private String age;

    // Do not provide a constructor
    // Do not provide setters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static UserDtoBuilder getBuilder() {
        return new UserDtoBuilder();
    }

    public static class UserDtoBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDto dto;

        public UserDtoBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder birthday(LocalDate date) {
            int ageInYears = Period.between(date, LocalDate.now()).getYears();
            this.age = Integer.toString(ageInYears);
            return this;
        }

        public UserDtoBuilder address(Address address) {
            this.address = address.getHouseNumber() + ", "
                    + address.getStreet() + ", "
                    + address.getCity() + ", "
                    + address.getState() + ", "
                    + address.getZipcode();
            return this;
        }

        public UserDto build() {
            this.dto = new UserDto();
            dto.name = firstName + " " + lastName;
            dto.address = address;
            dto.age = age;
            return this.dto;
        }

        public UserDto getUserDto() {
            return this.dto;
        }
    }
}

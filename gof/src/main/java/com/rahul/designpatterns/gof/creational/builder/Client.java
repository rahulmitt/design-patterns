package com.rahul.designpatterns.gof.creational.builder;

import com.rahul.designpatterns.gof.creational.builder.pojo.Address;
import com.rahul.designpatterns.gof.creational.builder.pojo.User;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder builder = new UserWebDtoBuilder();
        UserDto dto = buildUserDto(builder, user);
        System.out.println("Dto created: " + dto);
    }

    private static UserDto buildUserDto(UserDtoBuilder builder, User user) {
        return builder.firstName(user.getFirstName())
                .lastName(user.getLastName())
                .address(user.getAddress())
                .birthday(user.getBirthday())
                .build();
    }

    private static User createUser() {
        Address address = new Address();
        address.setHouseNumber("B2405");
        address.setStreet("Lodha Luxoria");
        address.setCity("Thane");
        address.setState("Maharashtra");
        address.setZipcode("400601");

        User user = new User();
        user.setBirthday(LocalDate.of(1982, 11, 27));
        user.setFirstName("Rahul");
        user.setLastName("Mittal");
        user.setAddress(address);
        return user;
    }
}

package com.playground.user.dto;

import lombok.Data;

@Data
public class AddressCreationRequestDTO {

    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String floor;
    private String zipCode;
    private String additionalAddress;
    private String company;
    private String info;
}

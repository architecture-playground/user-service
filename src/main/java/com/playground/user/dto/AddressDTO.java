package com.playground.user.dto;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class AddressDTO {

    private UUID id;
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private String floor;
    private String zipcode;
    private String additionalAddress;
    private String info;
    private Instant createdAt;
    private Instant updatedAt;
}

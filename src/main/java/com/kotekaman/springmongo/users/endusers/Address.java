package com.kotekaman.springmongo.users.endusers;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Address {
    private String country;
    private String city;
    @Size(min=5)
    @NotBlank
    private String postalCode;

    public Address(String country, String city, String postalCode) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
    }
}

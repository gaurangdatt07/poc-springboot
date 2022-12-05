package com.poc.backendApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String city;
    private String state;
    private String country;
    private String zipCode;
}

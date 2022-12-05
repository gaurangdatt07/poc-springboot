package com.poc.backendApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Student {

    private String id;
    private String name;
    private String mail;
    private String contact;
    private Address address;
    private Gender gender;
}

package com.morrie.myshop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * Created by morrie kim on 2020/04/08.
 */
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}

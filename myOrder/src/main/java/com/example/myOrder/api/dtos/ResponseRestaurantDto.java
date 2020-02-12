package com.example.myOrder.api.dtos;

public class ResponseRestaurantDto {

    private Integer id;
    private String name;
    private String email;
    private String phone;

    public Integer getId() {
        return id;
    }

    public ResponseRestaurantDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ResponseRestaurantDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ResponseRestaurantDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ResponseRestaurantDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}

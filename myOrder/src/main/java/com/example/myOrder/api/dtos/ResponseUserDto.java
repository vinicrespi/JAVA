package com.example.myOrder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class ResponseUserDto {

    @NotEmpty
    @ApiModelProperty(value = "${user.create.id}")
    private Integer id;

    @NotEmpty
    @ApiModelProperty(value = "${user.create.name}")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "${user.create.phone}")
    private String phone;

    @NotEmpty
    @ApiModelProperty(value = "${user.create.email}")
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "${user.create.address}")
    private String address;

    public Integer getId() {
        return id;
    }

    public ResponseUserDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ResponseUserDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ResponseUserDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ResponseUserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ResponseUserDto setAddress(String address) {
        this.address = address;
        return this;
    }
}

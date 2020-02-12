package com.example.myOrder.api.mappers;

import com.example.myOrder.api.dtos.CreateUserDto;
import com.example.myOrder.api.dtos.ResponseUserDto;
import com.example.myOrder.entities.User;
import org.modelmapper.ModelMapper;

public class UserMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static User toEntity(CreateUserDto createUserDto){
        return modelMapper.map(createUserDto, User.class);
    }

    public static ResponseUserDto toResponseDto(User user){
        return modelMapper.map(user, ResponseUserDto.class);
    }


}

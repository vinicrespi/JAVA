package com.example.myOrder.services;

import com.example.myOrder.api.dtos.CreateUserDto;
import com.example.myOrder.api.dtos.ResponseUserDto;
import com.example.myOrder.api.mappers.UserMapper;
import com.example.myOrder.entities.User;
import com.example.myOrder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
/*
    public ResponseUserDto create(CreateUserDto createUserDto){
        saveUser(UserMapper.toEntity(createUserDto));
    }

    private void validateUserEmail(String email){



    private User saveUser(User user)
    {
        return userRepository.save(user);
    }
*/
}

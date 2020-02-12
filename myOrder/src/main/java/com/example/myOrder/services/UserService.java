package com.example.myOrder.services;

import com.example.myOrder.api.dtos.CreateUserDto;
import com.example.myOrder.api.dtos.ResponseUserDto;
import com.example.myOrder.api.mappers.UserMapper;
import com.example.myOrder.entities.User;
import com.example.myOrder.exceptions.AlreadyExistsException;
import com.example.myOrder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseUserDto create(CreateUserDto createUserDto){
        validateUserEmail(createUserDto.getEmail());

        userRepository.save(createUser(createUserDto));

        return null;
    }

    private User createUser(CreateUserDto createUserDto){
        return new User()
                .setName(createUserDto.getName())
                .setEmail(createUserDto.getEmail())
                .setAddress(createUserDto.getAddress())
                .setPassword(createUserDto.getPassword())
                .setPhone(createUserDto.getPhone());
    }

    private void validateUserEmail(String email){
        User user = userRepository.findByEmail(email);
        if (user != null){
            throw new AlreadyExistsException("Já existe um usuário cadastrado com esse email");
        }
    }



    private User saveUser(User user)
    {
        return userRepository.save(user);
    }

}

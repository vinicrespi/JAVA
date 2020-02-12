package com.example.myOrder.api.controllers;

import com.example.myOrder.api.RestPath;
import com.example.myOrder.api.dtos.CreateUserDto;
import com.example.myOrder.api.dtos.ResponseUserDto;
import com.example.myOrder.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController("UserController")
@RequestMapping(RestPath.BASE_PATH + "/users")
@Api(tags = "Usuários")
public class UserController {

        @Autowired
        private UserService userService;

        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseUserDto create(
                @ApiParam(value = "Objeto que contem as informacoes do usuario")
                @RequestBody @Valid CreateUserDto createUserDto
                ){
            return userService.create(createUserDto);
        }
}

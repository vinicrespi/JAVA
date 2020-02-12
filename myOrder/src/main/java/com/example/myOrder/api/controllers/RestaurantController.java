package com.example.myOrder.api.controllers;

import com.example.myOrder.api.RestPath;
import com.example.myOrder.api.dtos.CreateRestaurantDto;
import com.example.myOrder.api.dtos.ResponseRestaurantDto;
import com.example.myOrder.entities.Restaurant;
import com.example.myOrder.services.RestaurantService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController("RestaurantControllerV1")
@RequestMapping(RestPath.BASE_PATH + "/restaurant")
@Api(tags = "Restaurantes")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody @Valid CreateRestaurantDto createRestaurantDto){
        restaurantService.createRestaurant((createRestaurantDto));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public ResponseRestaurantDto get(@RequestParam @Param("id") Integer id){
        return restaurantService.getById(id);
    }

}



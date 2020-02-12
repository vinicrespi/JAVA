package com.example.myOrder.services;

import com.example.myOrder.api.dtos.CreateRestaurantDto;
import com.example.myOrder.api.dtos.ResponseRestaurantDto;
import com.example.myOrder.entities.Restaurant;
import com.example.myOrder.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public void createRestaurant(CreateRestaurantDto createRestaurantDto){

        //TODA validações

        Restaurant restaurant = new Restaurant()
                .setEmail(createRestaurantDto.getEmail())
                .setName(createRestaurantDto.getName())
                .setPhone(createRestaurantDto.getPhone());

        restaurantRepository.save(restaurant);
    }
    public ResponseRestaurantDto getById(Integer id){
        Optional<Restaurant> optional = restaurantRepository.findById(id);
        if(optional.isPresent()) {
            Restaurant restaurant = optional.get();
            return new ResponseRestaurantDto()
                    .setEmail(restaurant.getEmail())
                    .setName(restaurant.getName())
                    .setPhone(restaurant.getPhone())
                    .setId(restaurant.getId());
        }
        return null;
    }
}

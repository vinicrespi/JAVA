package com.example.myOrder.repositories;

import com.example.myOrder.api.dtos.CreateUserDto;
import com.example.myOrder.api.dtos.ResponseUserDto;
import com.example.myOrder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u " +
            "WHERE u.email = :userEmail")
    //public User findByEmail(String email);
    public User findByEmail(@Param("userMail") String email);

}

package com.example.HotelSpringbootProject.repository;

import com.example.HotelSpringbootProject.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
//here we write operation which will be perform on db
    Optional<Customer> findByEmail(String email);//Optional there are chances of null so Optional used
}

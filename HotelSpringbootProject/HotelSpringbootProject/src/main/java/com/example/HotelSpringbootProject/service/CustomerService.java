package com.example.HotelSpringbootProject.service;

import com.example.HotelSpringbootProject.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Customer getCustomerById(int id);

    Customer updateCustomer(Customer customer, int id);

    void deleteBook(int id);
}

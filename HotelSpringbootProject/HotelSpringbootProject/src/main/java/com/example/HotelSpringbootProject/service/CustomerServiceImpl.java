package com.example.HotelSpringbootProject.service;

import com.example.HotelSpringbootProject.models.Customer;
import com.example.HotelSpringbootProject.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//to act this class as service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    public CustomerRepo customerRepo;

    CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo=customerRepo;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();//to get all data
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepo.findById(id).orElseThrow();
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        Customer existingCustomer=customerRepo.findById(id).orElseThrow();
        existingCustomer.setCity(customer.getCity());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setName(customer.getName());
        existingCustomer.setNumberOfPerson(customer.getNumberOfPerson());
        customerRepo.save(existingCustomer);

        return existingCustomer;
    }

    @Override
    public void deleteBook(int id) {
        customerRepo.findById(id).orElseThrow();
        customerRepo.deleteById(id);
    }

}

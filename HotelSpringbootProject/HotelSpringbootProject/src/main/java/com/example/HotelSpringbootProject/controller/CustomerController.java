package com.example.HotelSpringbootProject.controller;

import com.example.HotelSpringbootProject.models.Customer;
import com.example.HotelSpringbootProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    CustomerController(CustomerService customerService){

        this.customerService=customerService;
    }

    @PostMapping//it should be always above THE method ie. AT METHOD LEVEL . it is used for creation
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){//ResponseEntity represents Http response including headers,body,status.we will get data in the form of ResponseEntity
        return new ResponseEntity<Customer>( customerService.saveCustomer(customer), HttpStatus.CREATED);//here we are creating and saving data in db
    }                                                               //if it si created the status will be 201 Ok
    @GetMapping
    public List<Customer> getAllCustomer(){
        return  customerService.getAllCustomer();
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id){
        return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
    }

    @PutMapping("{id}")//for updation we can also use @Postmapping("{id}") which work in same manner
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id")int id, @RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.updateCustomer(customer,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id")int id){
        customerService.deleteBook(id);
        return new ResponseEntity<String>("Customer data deleted successfully",HttpStatus.OK);
    }

}

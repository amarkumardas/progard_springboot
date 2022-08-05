package com.example.HotelSpringbootProject.Security;

import com.example.HotelSpringbootProject.models.Customer;
import com.example.HotelSpringbootProject.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails implements UserDetailsService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer=this.customerRepo.findByEmail(username).orElseThrow();
        return customer;
    }
}

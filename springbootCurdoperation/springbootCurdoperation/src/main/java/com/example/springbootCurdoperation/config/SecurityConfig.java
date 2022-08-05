package com.example.springbootCurdoperation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {//to perform all type of request like GET,POST...
        /*What is the real-life reason to disable it?
           The Spring documentation suggests:
           Our recommendation is to use CSRF protection for any request that could be processed by a browser by normal users.
           If you are only creating a service that is used by non-browser clients, you will likely want to disable CSRF protection.

        What does CSRF () Disable () do?
        CSRF stands for Cross-Site Request Forgery. It is an attack that forces an end user to execute unwanted code on a
        web application in which they are currently authenticated.*/

        http.csrf().disable().authorizeHttpRequests().anyRequest().authenticated().and().httpBasic();
    }
}

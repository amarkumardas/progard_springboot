package com.example.springbootCurdoperation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//we are changing the format of so cinfiguration required
public class WebConfig implements WebMvcConfigurer {//to change JSON format to Xml format
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {//THIS METHOD CHANGES request and response format from JSON format to Xml format
         configurer.defaultContentType(MediaType.APPLICATION_XML);//setting to default Aplication xml
    }
}

package com.example.communicationBetweenToMicroServise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommunicationBetweenToMicroServiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationBetweenToMicroServiseApplication.class, args);
	}

}

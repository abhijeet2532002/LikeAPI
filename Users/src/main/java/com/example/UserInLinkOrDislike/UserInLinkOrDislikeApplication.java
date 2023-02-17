package com.example.UserInLinkOrDislike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserInLinkOrDislikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInLinkOrDislikeApplication.class, args);
		System.out.println("\n\t\t --------- User service running -------\n");
	}

}

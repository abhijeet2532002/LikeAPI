package com.Likes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikesApplication.class, args);
		System.out.println("\n\t\t--------- Like service running --------\t");
	}

}

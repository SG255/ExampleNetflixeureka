package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsServiceApplication.class, args);
	}

}

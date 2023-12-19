package com.example.CoursesApiApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoursesApiAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoursesApiAppApplication.class, args);
	}
}

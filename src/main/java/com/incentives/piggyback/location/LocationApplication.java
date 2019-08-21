package com.incentives.piggyback.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LocationApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World on Docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}


}
package com.example.sololearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@SpringBootApplication
@RestController
public class SololearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SololearnApplication.class, args);
	}

	@GetMapping
	// returning json
//	public List<String> hello() {
//		return List.of("Hello", "Sololearn!");
//	}

	// returning string
	public String hello() {
		return "Hello, Sololearn!";
	}

}

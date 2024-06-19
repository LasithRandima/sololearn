package com.example.sololearn;

import com.example.sololearn.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SololearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SololearnApplication.class, args);
	}

	@GetMapping
	// returning json array
//	public List<String> hello() {
//		return List.of("Hello", "Sololearn!");
//	}

	// returning string
//	public String hello() {
//		return "Hello, Sololearn!";
//	}

//	 returning json array of objects
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.james@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21
				)
		);
	}

}

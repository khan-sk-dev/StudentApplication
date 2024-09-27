package com.springboot.crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student sohaib = new Student("Sohaib", "sohaib@gmail.com", 24, LocalDate.of(2000, Month.FEBRUARY, 5));
			Student sameer = new Student("Sameer", "sohaib@gmail.com", 24, LocalDate.of(2000, Month.FEBRUARY, 5));

			studentRepository.saveAll(List.of(sohaib, sameer));
		};
	}

}

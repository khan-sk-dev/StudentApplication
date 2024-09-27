package com.springboot.crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudents() {
		return List.of(new Student(1L, "Sohaib", "sohaib@gmail.com", 24, LocalDate.of(2000, Month.FEBRUARY, 5)),
				new Student(2L, "John Doe", "john.doe@gmail.com", 22, LocalDate.of(2002, Month.MARCH, 15)));
	}
}
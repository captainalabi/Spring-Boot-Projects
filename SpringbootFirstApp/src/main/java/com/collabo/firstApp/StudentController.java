package com.collabo.firstApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http://localhost:8081/student
	@GetMapping("/student")
	public Student getStudent() {
		
		return new Student("Alabi", "Razaq");
	}
	
	//http://localhost:8081/students
		@GetMapping("/students")
	public List <Student> getStudents(){
		
		List <Student> students = new ArrayList<>();
		students.add(new Student("Alabi", "Razaq"));
		students.add(new Student("Abubakar", "Razaq"));
		students.add(new Student("Abdulqadri", "Razaq"));
		students.add(new Student("AbdulRahman", "Razaq"));
		students.add(new Student("Azeezat", "Razaq"));
		
				return students;
	}
}

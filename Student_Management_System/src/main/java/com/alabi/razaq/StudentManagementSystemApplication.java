package com.alabi.razaq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alabi.razaq.entity.Student;
import com.alabi.razaq.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student st1 = new Student("Alabi", "Razaq", "alabi@yahoo.com");
//		studentRepository.save(st1);
//		
//		Student st2 = new Student("AlabiRich", "RazaqNice", "rich@yahoo.com");
//		studentRepository.save(st2);
//		
//		Student st3 = new Student("Onimago", "RazaqFine", "fine@yahoo.com");
//		studentRepository.save(st3);
	}

}

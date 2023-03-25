package com.alabi.razaq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alabi.razaq.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}

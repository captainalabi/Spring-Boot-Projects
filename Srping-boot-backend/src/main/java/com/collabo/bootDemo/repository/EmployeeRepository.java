package com.collabo.bootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabo.bootDemo.model.Employee;

public interface EmployeeRepository extends JpaRepository < Employee, Long > {

}

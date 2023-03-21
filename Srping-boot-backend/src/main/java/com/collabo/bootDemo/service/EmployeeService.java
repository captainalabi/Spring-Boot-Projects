package com.collabo.bootDemo.service;

import java.util.List;

import com.collabo.bootDemo.model.Employee;

public interface EmployeeService {

	Employee saveEmployee (Employee employee);
	
	List<Employee> getAllEmployees();

	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee, long id);
	
	void deleteEmployee(long id);
}

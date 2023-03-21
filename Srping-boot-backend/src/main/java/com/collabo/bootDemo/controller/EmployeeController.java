package com.collabo.bootDemo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.collabo.bootDemo.model.Employee;
import com.collabo.bootDemo.repository.EmployeeRepository;
import com.collabo.bootDemo.service.EmployeeService;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//Build create employee rest API
	@PostMapping
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee ){
	return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//build get all employee rest api
	//http://localhost:8080/api/employees
	@GetMapping
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
	}
	
	//build get employee by id rest API
	//http://localhost:8080/api/employees/1234
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employee){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employee), HttpStatus.OK);
	}
	
	//build update employee Rest API
	//http://localhost:8080/api/employees/1234
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	//build delete employee Rest API
	//http://localhost:8080/api/employees/1234
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
		//delete from db
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee Deleted successfully", HttpStatus.OK);
	}
}

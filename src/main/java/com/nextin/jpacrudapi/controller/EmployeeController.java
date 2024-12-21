package com.nextin.jpacrudapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nextin.jpacrudapi.model.Employee;
import com.nextin.jpacrudapi.service.EmployeeService;

@RestController
public class EmployeeController {

	private final EmployeeService service;

//	using constructor injection
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

//	getting all the details of the employee (get all)
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

//	getting the employee details by his/her id (get by id)
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return service.getEmployeeById(empId);
	}

//	register an employee in databases (insert employee)
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}

//	update an employee details (update)
	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}

//	remove the information of the employee by his/her id (delete)
	@DeleteMapping("/employee/{empId}")
	public void removeEmployee(@PathVariable int empId) {
		service.removeEmployee(empId);
	}

}

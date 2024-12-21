package com.nextin.jpacrudapi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nextin.jpacrudapi.model.Employee;
import com.nextin.jpacrudapi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository repository;
//	using constructor injection
	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

//	getting all the details of employee 
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

//	getting an employee details by his/her id 
	public Employee getEmployeeById(int empId) {
		return repository.findById(empId).orElse(new Employee());
	}

//	register an employee in databases
	public void addEmployee(Employee employee) {
		repository.save(employee);
	}

//	remove the information of the employee by his/her id
	public void removeEmployee(int empId) {
		repository.deleteById(empId);
	}

}

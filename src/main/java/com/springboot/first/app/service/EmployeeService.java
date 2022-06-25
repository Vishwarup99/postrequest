package com.springboot.first.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.first.app.model.Employee;
import com.springboot.first.app.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepository;
	
	public Employee saveEmployee(Employee employee) {
		System.out.println("Code in Service" + employee);
		System.out.println("Repo documents" + emprepository.findAll());
		return emprepository.save(employee);
	}
}

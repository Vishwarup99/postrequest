package com.springboot.first.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.first.app.model.Employee;
import com.springboot.first.app.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee){
		System.out.println("Code in Controller" + employee);
		return service.saveEmployee(employee);
	}
	
}

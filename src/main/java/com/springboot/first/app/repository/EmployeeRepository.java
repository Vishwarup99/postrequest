package com.springboot.first.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {

}

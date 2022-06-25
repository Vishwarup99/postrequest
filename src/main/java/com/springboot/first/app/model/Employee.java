package com.springboot.first.app.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "Book")
public class Employee {
	
	@Id
	private long id;
	private String firstName;
	private String lastName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Employee(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee() {}
	
	}

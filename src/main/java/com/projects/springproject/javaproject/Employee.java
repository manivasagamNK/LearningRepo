package com.projects.springproject.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Employee {

	String name;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	double price;

	public Employee(String nameValue, double priceValue,String department) {
		this.name = nameValue;
		this.price = priceValue;
		this.department=department;
	}
}

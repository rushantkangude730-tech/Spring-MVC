package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository
public class EmployeeDao {
	
	public void createEmployee(Employee employee) {
		System.out.println("Employee in Repo---> " + employee);
	}

}

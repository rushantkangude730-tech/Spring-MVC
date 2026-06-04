package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeDao employeeDao;
	
	public void createEmployee(Employee employee)
	{
		System.out.println("Employee in service ---> " + employee);
		
		employeeDao.createEmployee(employee);
		
	}

}

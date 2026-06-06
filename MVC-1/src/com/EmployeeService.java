package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//	
//	setName("Rahul")
	
	public void registerEmployee(Employee employee)
	{
		
		
		
		System.out.println("Employee in Service Class: --->" + employee);
		
		boolean flag = employee.getUsername().isEmpty();
		
		if(flag) {
			throw new RuntimeException("Username cannot be Empty");			
		}
		
		employeeRepo.createEmployee(employee);
		
	}

	public String employeeLogin(String username, String password) {
		
		if(username.equalsIgnoreCase("admin") && password.equals("admin"))
		{
			return "employeeList";
		}
		
		return "errorLogin";
		
	}
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepo.getAllEmployee();
	}

}

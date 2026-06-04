package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/reg")
	public String registeration(@ModelAttribute Employee employee)
	{	
		System.out.println(employee);
		return "success";
	}

}

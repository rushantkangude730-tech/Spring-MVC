package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/reg" , method = RequestMethod.POST)
	public String registeration()
	{
		
		return "success";
	}

}

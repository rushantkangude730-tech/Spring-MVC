package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	
	//http://localhost:8080/reg
	
	// EmployeeService  -> @Component  | @Configuration bean | @service | @Repository
	
//	@RequestMapping("/register")
//	public String register(@RequestParam ("username") String uname,
//			               @RequestParam ("password") String pass)
//	{
//		System.out.println("Request Received...");
//		System.out.println(uname + " " + pass);
//		
//		return "login";
//	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute Employee employee)
	{
		
		
		
		System.out.println("Request Received...");
		System.out.println("Employee in Controller: " + employee);
		
		employeeService.registerEmployee(employee);
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam ("username") String username,
			            @RequestParam ("password") String password,
	                    Model model)
	{
		
		String response = employeeService.employeeLogin(username,password);
		
		model.addAttribute("employeeList", employeeService.getAllEmployee());
		
		return response;
	}

}

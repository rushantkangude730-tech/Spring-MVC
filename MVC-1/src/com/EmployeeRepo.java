package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	
	@Autowired
	public SessionFactory sf;
	
	public void createEmployee(Employee employee)
	{
		Session session = sf.openSession();
		session.save(employee);
		session.beginTransaction().commit();
	}
	
	public List<Employee> getAllEmployee()
	{
		Session session = sf.openSession();
		return session.createQuery("from Employee").getResultList();	
	}

}

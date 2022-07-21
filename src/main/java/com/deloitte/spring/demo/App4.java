package com.deloitte.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.spring.demo.dao.EmployeeDao;
import com.deloitte.spring.demo.model.Employee;

//https://docs.spring.io/spring-framework/docs/current/reference/html/data-access.html#jdbc

public class App4 {

	public static void main(String[] args) {

		System.out.println("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("DataSource.xml");

		EmployeeDao empDao = context.getBean(EmployeeDao.class);

		Employee empObjToSave = new Employee(103, "Tonu", 95000);

		int numberOfRecords = empDao.saveEmployee(empObjToSave);
		System.out.println(numberOfRecords + " record(s) inserted.");

		System.out.println("End");

	}

}

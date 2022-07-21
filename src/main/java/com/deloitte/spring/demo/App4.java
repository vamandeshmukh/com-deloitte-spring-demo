package com.deloitte.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.spring.demo.dao.EmployeeDao;
import com.deloitte.spring.demo.model.Employee;

public class App4 {

	public static void main(String[] args) {

		System.out.println("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("DataSource.xml");

		EmployeeDao empDao = context.getBean(EmployeeDao.class);

		Employee empObjToSave = new Employee(102, "Monu", 90000);

		empDao.saveEmployee(empObjToSave);

		System.out.println("End");

	}

}

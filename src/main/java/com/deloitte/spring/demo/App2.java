package com.deloitte.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deloitte.spring.demo.config.SpringConfig;
import com.deloitte.spring.demo.model.Employee;

//2. Java based configuration  
public class App2 {

	public static void main(String[] args) {

		ApplicationContext context = 
	new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee emp = context.getBean(Employee.class);

		System.out.println(emp.toString());

	}

}

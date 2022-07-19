package com.deloitte.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.spring.demo.model.Employee;

/**
 * @author Vaman Deshmukh
 *
 */

// basic concepts - 
// bean - object 
// DI -   Dependency Injection 
// IoC -  Inversion of Control 
// Container - file that gives beans (objects)

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = new Employee(101, "Sonu", 90000);
		Employee emp = context.getBean(Employee.class);

		System.out.println(emp.toString());

		System.out.println("End");

	}

}

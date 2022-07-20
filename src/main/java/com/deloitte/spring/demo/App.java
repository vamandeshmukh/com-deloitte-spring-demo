package com.deloitte.spring.demo;

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

// important concepts to discuss - 
// DI 
// property injection / setter injection 
// constructor injection 
// other types of injection 
// scope of beans 
// 

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = new Employee(101, "Sonu", 90000); // not needed 

		Employee emp = context.getBean("e1", Employee.class);

		Employee emp2 = context.getBean("e3", Employee.class);

		System.out.println(emp.equals(emp2));
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
//		emp2.setSalary(95000);
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		System.out.println("End");

	}

}

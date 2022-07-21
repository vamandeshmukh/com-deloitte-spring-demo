package com.deloitte.spring.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.deloitte.spring.demo.model.Employee;

//3. Annotation based configuration 

@ComponentScan
public class App3 {

//	@Autowired
	Employee emp2;

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App3.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

	}

}

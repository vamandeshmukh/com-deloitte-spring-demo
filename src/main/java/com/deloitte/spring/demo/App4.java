package com.deloitte.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("DataSource.xml");
		context.getBean(null);

	}

}

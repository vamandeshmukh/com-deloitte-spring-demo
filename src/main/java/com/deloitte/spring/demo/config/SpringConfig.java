package com.deloitte.spring.demo.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deloitte.spring.demo.model.Department;
import com.deloitte.spring.demo.model.Employee;

//@Configuration
public class SpringConfig {

	@Bean
	public Employee getInstance() {

//		return new Employee();
//		return new Employee(101, "Sonu", 95000);
		return new Employee(101, "Sonu", 95000, 
new ArrayList<>(Arrays.asList("Banking", "Finance", "Stocks")),
				new Department(10, "HR", "Hyderabad"));

	}

}

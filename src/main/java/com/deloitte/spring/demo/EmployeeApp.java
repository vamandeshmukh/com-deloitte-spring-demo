package com.deloitte.spring.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.spring.demo.model.Employee;
import com.deloitte.spring.demo.service.EmployeeService;

public class EmployeeApp {

	private static Scanner sc = new Scanner(System.in);
	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	private static EmployeeService empService = context.getBean(EmployeeService.class);

	public static void main(String[] args) {

		System.out.println("Start");
		System.out.println("\n--- welcome to employee management application ---\n");
		EmployeeApp.selectOptions();
		System.out.println("End");

	}

	private static void selectOptions() {
		System.out.println(
				"\nPlease select an option: \n1. View all employees \n2. View employee by id \n3. View employee by first name \n4. Add a new employee \n5. Update an employee \n6. Delete an employee \n7. exit \n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {

			List<Employee> empList = empService.getAllEmps();
			System.out.println("List of all employees:");
			empList.forEach(e -> System.out.println(e.toString()));
			EmployeeApp.selectOptions();
			break;
		}
		case 2: {
			System.out.println("Please enter employee id to search:");
			int num = sc.nextInt();
			Employee emp = empService.getEmpById(num);
			System.out.println(emp.toString());
			EmployeeApp.selectOptions();
			break;
		}
		case 3: {
			System.out.println("Please enter firstName to search:");
			String firstName = sc.next();
			List<Employee> empList = empService.getEmpByFirstName(firstName);
			empList.forEach(e -> System.out.println(e.toString()));
			EmployeeApp.selectOptions();
			break;
		}
		case 4: {
			System.out.println("Please enter employee details: \n");
			System.out.println("Enter employeeId");
			int employeeId = sc.nextInt();
			System.out.println("Enter firstName");
			String firstName = sc.next();
			System.out.println("Enter salary");
			double salary = sc.nextDouble();
			int num = empService.addEmp(new Employee(employeeId, firstName, salary));
			System.out.println(num + " employee added successfully!");
			EmployeeApp.selectOptions();
			break;
		}
		case 5: {
			System.out.println("coming soon...");
			EmployeeApp.selectOptions();
			break;
		}
		case 6: {
			System.out.println("coming soon...");
			EmployeeApp.selectOptions();
			break;
		}
		case 7: {
			System.out.println("Thank you for using this app!");
			System.exit(0);
		}

		default: {
			System.out.println("Invalid input. Please enter proper value:");
			EmployeeApp.selectOptions();
			break;

		}
		}
		sc.close();
	}
}

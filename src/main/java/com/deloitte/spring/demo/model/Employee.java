package com.deloitte.spring.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employee {

//	private int employeeId;
//	private String firstName;
//	private double salary;
//	private List<String> projects;
//	private Department department;

	private int employeeId = 101;
	private String firstName = "Sonu";
	private double salary = 90000;
	private List<String> projects = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
	private Department department = new Department(10, "HR", "Hyderabad");

//	public Employee() {
//		super();
//	}

	public Employee() {
		super();
		this.employeeId = 102;
		this.firstName = "Monu";
		this.salary = 95000;
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int employeeId, String firstName, double salary, List<String> projects, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
		this.projects = projects;
		this.department = department;
	}

	public void init() {
		// code before initialization of beans = setting some properties
		this.setDepartment(new Department(20, "L&D", "Pune"));
		System.out.println("bean initializing...");

	}

	public void destroy() {
		System.out.println("bean being destroyed...");

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + ", projects="
				+ projects + ", department=" + department + "]";
	}

}

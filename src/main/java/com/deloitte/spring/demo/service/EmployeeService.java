package com.deloitte.spring.demo.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.spring.demo.dao.EmployeeDao;
import com.deloitte.spring.demo.model.Employee;

public class EmployeeService {

	ApplicationContext context = new ClassPathXmlApplicationContext("DataSource.xml");

	EmployeeDao empDao = context.getBean(EmployeeDao.class);

	public List<Employee> getAllEmps() {
		return empDao.findAllEmployees();
	}

	public List<Employee> getEmpByFirstName(String firstName) {
		return empDao.findEmployeesByFirstName(firstName);
	}

	public int addEmp(Employee employee) {
		return empDao.saveEmployee(employee);
	}

	public Employee updateEmpFirstName(int employeeId, String firstName) {
		return empDao.updateEmployeeFirstName(employeeId, firstName);
	}

	public int deleteEmp(int employeeId) {
		return empDao.deleteEmployee(employeeId);
	}
}

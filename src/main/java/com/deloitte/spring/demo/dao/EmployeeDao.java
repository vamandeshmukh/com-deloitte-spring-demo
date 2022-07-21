package com.deloitte.spring.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.deloitte.spring.demo.model.Employee;

//CREATE TABLE employee (
//employee_id INT, 
//first_name VARCHAR(40), 
//salary DOUBLE,
//CONSTRAINT pk_emp PRIMARY KEY (employee_id));

//SELECT * FROM employee;

//https://docs.spring.io/spring-framework/docs/current/reference/html/data-access.html#jdbc

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee emp) {
		String sql = "INSERT INTO employee (employee_id, first_name, salary) VALUES (" + emp.getEmployeeId() + ",'"
				+ emp.getFirstName() + "'," + emp.getSalary() + ")";
		return jdbcTemplate.update(sql);
	}

	public Employee findEmployeeById(int employeeId) {
		String sqlQuery = "SELECT * FROM employee WHERE employee_id = ?";
		return jdbcTemplate.queryForObject(sqlQuery, (resultSet, rowNum) -> {
			Employee emp = new Employee();
			emp.setEmployeeId(resultSet.getInt("employee_id"));
			emp.setFirstName(resultSet.getString("first_name"));
			emp.setSalary(resultSet.getDouble("salary"));
			return emp;
		}, employeeId);
	}

//	findEmployeeByFirstName

//	findAllEmployees

//	updateEmployee

// 	deleteEmployee

}

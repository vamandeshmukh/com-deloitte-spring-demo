package com.deloitte.spring.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.deloitte.spring.demo.model.Employee;

//CREATE TABLE employee (
//employee_id INT, 
//first_name VARCHAR(40), 
//salary DOUBLE,
//CONSTRAINT pk_emp PRIMARY KEY (employee_id));

//SELECT * FROM employee;

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

	public Employee findEmployeeById(Employee emp) {
		String sqlQuery = "SELECT * FROM employee WHERE employee_id = ?";
		return jdbcTemplate.queryForObject(sqlQuery ,
		        (resultSet, rowNum) -> {
		            Actor newActor = new Actor();
		            newActor.setFirstName(resultSet.getString("first_name"));
		            newActor.setLastName(resultSet.getString("last_name"));
		            return newActor;
		        },
		        1212L);;
	}
}

package com.deloitte.spring.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeServiceTests {

	@Test
	public void testGetEmpById() {
		EmployeeService empService = new EmployeeService();
		assertEquals(empService.getEmpById(102).getEmployeeId(), 102);
	}

}

package com.deloitte.spring.demo.model;

public class Department {

	private int departmentId;
	private String departmentName;
	private String city;

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentName, String city) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.city = city;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", city=" + city
				+ "]";
	}

}

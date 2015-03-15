package com.simplelistapp.business;

public class Employee {

	private String name;
	private Department department;

	public Employee(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public Department getDepartment() {
		return this.department;
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, department=%s]", name, department);
	}
}

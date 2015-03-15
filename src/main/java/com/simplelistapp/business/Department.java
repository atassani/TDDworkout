package com.simplelistapp.business;

public class Department {

	private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("Department [name=%s]", name);
	}
}

package com.simplelistapp.dao.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.simplelistapp.business.Department;
import com.simplelistapp.business.Employee;
import com.simplelistapp.dao.EmployeesDao;
import com.simplelistapp.database.DatabaseProvider;

public class EmployeesDaoImpl implements EmployeesDao {

	public EmployeesDaoImpl(DatabaseProvider databaseProvider) {
	}

	public List<Employee> getEmployeesByDate(Date date) {
		Department sales = new Department("Sales");
		Department engineering = new Department("Engineering");
		Department hr = new Department("HR");
		List<Employee> employeesByDate = Arrays.asList(new Employee("Mike", sales), new Employee("Tom", sales),
				new Employee("Barbara", hr), new Employee("Sally", engineering), new Employee("Alex", engineering),
				new Employee("Charles", hr)

		);
		return employeesByDate;
	}
}

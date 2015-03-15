package com.simplelistapp.dao;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.simplelistapp.business.Department;
import com.simplelistapp.business.Employee;
import com.simplelistapp.dao.EmployeesDao;

public class DummyEmployeesDao implements EmployeesDao {

	public List<Employee> getEmployeesByDate(Date date) {
		Department dep1 = new Department("dep1");
		Department dep2 = new Department("dep2");
		Department dep3 = new Department("dep3");
		return Arrays.asList(
				new Employee("Annie", dep1),
				new Employee("Bobby", dep1),
				new Employee("Cindy", dep2),
				new Employee("David", dep2),
				new Employee("Emily", dep1),
				new Employee("Frank", dep2),
				new Employee("Grace", dep3),
				new Employee("Henry", dep3)
				);
	}

}

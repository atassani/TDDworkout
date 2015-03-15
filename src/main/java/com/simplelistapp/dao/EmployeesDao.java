package com.simplelistapp.dao;

import java.util.Date;
import java.util.List;

import com.simplelistapp.business.Employee;

public interface EmployeesDao {

	List<Employee> getEmployeesByDate(Date date);

}

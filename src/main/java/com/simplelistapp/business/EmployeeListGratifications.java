package com.simplelistapp.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.simplelistapp.dao.EmployeesDao;
import com.simplelistapp.security.SecurityProvider;
import com.simplelistapp.ws.DepartmentsWebService;

public class EmployeeListGratifications {

	private SecurityProvider securityProvider;
	private EmployeesDao employeesDao;
	private DepartmentsWebService departmentsWs;

	public List<String> gratifiedEmployees(Date date) {
		if (!securityProvider.conditionsChecked())
			throw new IllegalStateException("Conditions not fulfilled");

		List<Employee> employees = employeesDao.getEmployeesByDate(date);
		List<Department> departments = departmentsWs.getDepartmentsGratification();
		List<String> result = new ArrayList<String>();
		int i = 0;
		while (i <= employees.size() - 1) {
			int j = 0;
			while (j < departments.size() - 1) {
				if (employees.get(i).getDepartment().getName().equals(departments.get(j).getName())) {
					result.add(employees.get(i).getName());
				}
				j = j + 1;
			}
			i++;
		}

		return result;
	}

	public void setSecurityProvider(SecurityProvider securityProvider) {
		this.securityProvider = securityProvider;
	}

	public void setEmployeesDao(EmployeesDao employeesDao) {
		this.employeesDao = employeesDao;
	}

	public void setDepartmentWebService(DepartmentsWebService departmentsWs) {
		this.departmentsWs = departmentsWs;
	}
}

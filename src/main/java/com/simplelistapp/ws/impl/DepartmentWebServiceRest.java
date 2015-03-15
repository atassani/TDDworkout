package com.simplelistapp.ws.impl;

import java.util.Arrays;
import java.util.List;

import com.simplelistapp.business.Department;
import com.simplelistapp.ws.DepartmentsWebService;

public class DepartmentWebServiceRest implements DepartmentsWebService {

	public List<Department> getDepartmentsGratification() {
		List<Department> departments = Arrays.asList(new Department("Sales"), new Department("Engineering"),
				new Department("HR"));
		return departments;
	}

}

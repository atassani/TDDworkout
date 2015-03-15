package com.simplelistapp.ws;

import java.util.Arrays;
import java.util.List;

import com.simplelistapp.business.Department;

public class DummyDepartmentsWebService implements DepartmentsWebService {

	public List<Department> getDepartmentsGratification() {
		List<Department> departments = Arrays.asList(
				new Department("dep1"),
				new Department("dep2")
		);
		return departments;
	}

}

package com.simplelistapp.business;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.simplelistapp.dao.DummyEmployeesDao;
import com.simplelistapp.security.DummySecurityProvider;
import com.simplelistapp.ws.DummyDepartmentsWebService;

public class GratificationsTest {

	@Test
	public void test() {
		EmployeeListGratifications gratifications = new EmployeeListGratifications();
		gratifications.setSecurityProvider(new DummySecurityProvider());
		gratifications.setEmployeesDao(new DummyEmployeesDao());
		gratifications.setDepartmentWebService(new DummyDepartmentsWebService());

		List<String> employees = gratifications.gratifiedEmployees(new Date());
		List<String> expected = Arrays.asList(
				"Annie",
				"Bobby",
				"Cindy",
				"David",
				"Emily",
				"Frank" );
		Collections.sort(employees);
		Collections.sort(expected);
		assertEquals(expected.toString(), employees.toString());
	}
}

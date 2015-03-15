package com.simplelistapp;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplelistapp.business.EmployeeListGratifications;

public class AppRunner {

	public static void main(String[] args) {
		AppRunner appRunner = new AppRunner();
		appRunner.run();
	}

	private void run() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");

		EmployeeListGratifications employeeListGratifications = (EmployeeListGratifications) applicationContext.getBean("employeeListGratifications");

		List<String> gratifiedEmployees = employeeListGratifications.gratifiedEmployees(new Date());
		for (String employee : gratifiedEmployees) {
			System.out.println(employee);
		}
	}

}

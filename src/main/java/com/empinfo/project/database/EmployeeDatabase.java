package com.empinfo.project.database;

import java.util.HashMap;
import java.util.Map;

import com.empinfo.project.model.Employee;

public class EmployeeDatabase {
	public static Map<Long, Employee> employees = new HashMap<>();

	public static Map<Long, Employee> getEmployees() {
		return employees;
	}
}

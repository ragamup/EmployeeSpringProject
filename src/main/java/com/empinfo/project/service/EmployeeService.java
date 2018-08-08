package com.empinfo.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empinfo.project.database.EmployeeDatabase;
import com.empinfo.project.model.Employee;

public class EmployeeService {
	private Map<Long, Employee> employees = EmployeeDatabase.getEmployees();
	
	public EmployeeService() {
		employees.put(1L, new Employee(1,"Raghu","Muppavaram","It Department" ,"1234567890"));
	}

	public List<Employee> getAllEmployeeDetails() {
		return new ArrayList<Employee>(employees.values());

	}

	public Employee getEmployee(long id) {
		return employees.get(id);
	}

	public Employee addEmployee(Employee employee) {
		employee.setId(employees.size() + 1);
		employees.put(employee.getId(), employee);
		return employee;
	}

	public Employee updateEmployee(Employee employee) {

		if (employee.getId() <= 0) {
			return null;
		}
		employees.put(employee.getId(), employee);
		return employee;
	}

	public Employee deleteEmployee(long id) {
		return employees.remove(id);
	}
}

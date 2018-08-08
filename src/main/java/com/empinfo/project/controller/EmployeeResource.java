package com.empinfo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.empinfo.project.model.Employee;
import com.empinfo.project.service.EmployeeService;

@Controller
public class EmployeeResource {
	EmployeeService employeeService = new EmployeeService();
	
	Employee employee;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployeeDetails());
		return "getallemployees";
	}
	@GetMapping("/addemployee")
	public String addEmployeeForm( Model model , Employee employee) {
		model.addAttribute("employee", new Employee());
		return "addemployee";
	}
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(Employee employee) {
		 employeeService.addEmployee(employee);
		 return "redirect:getAllEmployees";
	}
	
	@RequestMapping(value = "/updateEmployee/{employeeId}", method=RequestMethod.GET)
	public String updateEmployee(@PathVariable("employeeId") long employeeId, Model model) {
		model.addAttribute("employee", employeeService.getEmployee(employeeId));
		return "updateemployee";
	}
	@RequestMapping(value = "/updatemployee/{employeeId}", method=RequestMethod.POST)
	public String updateEmployee(@PathVariable("employeeId") long employeeId, Employee employee) {
		employee.setId(employeeId);
		employeeService.updateEmployee(employee);
		 return "redirect:/getAllEmployees";
	}

	@RequestMapping(value = "/delEmployee/{employeeId}", method=RequestMethod.DELETE)
	public String delEmployee(@PathVariable("employeeId") long employeeId, Model model) {
		
		employeeService.deleteEmployee(employeeId);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping(value = "getemployee/{employeeId}", method=RequestMethod.GET)
	public String getSingleEmployee(@PathVariable("employeeId") long employeeId, Model model) {
		model.addAttribute("employee", employeeService.getEmployee(employeeId));
		
		 return "singleemployee";
	}

}

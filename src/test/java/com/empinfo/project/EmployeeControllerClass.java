package com.empinfo.project;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.empinfo.project.controller.EmployeeResource;
import com.empinfo.project.service.EmployeeService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeResource.class, secure=false)
public class EmployeeControllerClass {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private EmployeeService employeeService;
}

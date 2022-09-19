package com.NUExpenseManagementSystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NUExpenseManagementSystem.Models.Employee;
import com.NUExpenseManagementSystem.Services.EmployeeService;

@RestController

@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/search")
	public List<Employee> getStaff() {
		return this.employeeService.getStaff();
	}
	
	@GetMapping("/search/{searchId}")
	public Employee getStaffList(@PathVariable String searchId) {
		return this.employeeService.getStaffList(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public Employee registerStaff(@RequestBody Employee employee) {
		return this.employeeService.registerStaff(employee);
	}
	
	@PutMapping("/update")
	public Employee updateStaff(@RequestBody Employee employee) {
		return this.employeeService.updateStaff(employee);
	}
	
}

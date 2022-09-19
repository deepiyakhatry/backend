package com.NUExpenseManagementSystem.Services;

import java.util.List;

import com.NUExpenseManagementSystem.Models.Employee;

public interface EmployeeService{
   
	public List<Employee> getStaff();
	
	public Employee getStaffList(Long searchId);
	
	public Employee registerStaff(Employee employee);
	
	public Employee updateStaff(Employee employee);
	
}


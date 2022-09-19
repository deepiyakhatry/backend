package com.NUExpenseManagementSystem.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.NUExpenseManagementSystem.Models.Employee;
import com.NUExpenseManagementSystem.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getStaff() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getStaffList(Long searchId) {
		return employeeRepository.findById(searchId).get();
	}

	@Override
	public Employee registerStaff(Employee employee) {
		employee.setDel_flg(false);
		employee.setManager_flg(true);
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee updateStaff(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
}

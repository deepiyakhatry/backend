package com.NUExpenseManagementSystem.Services;

import java.util.List;

import com.NUExpenseManagementSystem.Models.DepartmentModel;

public interface DepartmentService {
	
	public List<DepartmentModel> getDepartmentList();
	
	public DepartmentModel getSingleDepartment(long searchId);

	public DepartmentModel registerDepartment(DepartmentModel departmentModel);

	public DepartmentModel updateDepartment(DepartmentModel departmentModel);	
		
}

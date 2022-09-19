package com.NUExpenseManagementSystem.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NUExpenseManagementSystem.Models.DepartmentModel;
import com.NUExpenseManagementSystem.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;	
 	
	@Override
	public List<DepartmentModel> getDepartmentList() {
		return departmentRepository.findAll();
	}
	
	@Override
	public DepartmentModel getSingleDepartment(long searchId) {
		return departmentRepository.findById(searchId).get();
	}

	@Override
	public DepartmentModel registerDepartment(DepartmentModel departmentModel) {
		departmentRepository.save(departmentModel);
		return departmentModel;		
	}

	@Override
	public DepartmentModel updateDepartment(DepartmentModel departmentModel) {
		departmentRepository.save(departmentModel);
		return departmentModel;
	}
	
}

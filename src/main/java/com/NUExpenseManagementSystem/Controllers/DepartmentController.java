package com.NUExpenseManagementSystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NUExpenseManagementSystem.Models.DepartmentModel;
import com.NUExpenseManagementSystem.Services.DepartmentService;

@RestController
@RequestMapping(value="/api/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/search")
	public List<DepartmentModel> getDepartmentList() {
		return this.departmentService.getDepartmentList();
	}
	
	@GetMapping("/search/{searchId}")
	public DepartmentModel getSingleDepartment(@PathVariable String searchId) {
		return this.departmentService.getSingleDepartment(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public DepartmentModel registerDepartment(@RequestBody DepartmentModel departmentModel) {
		return this.departmentService.registerDepartment(departmentModel);
	}
	
	@PutMapping("/update")
	public DepartmentModel upateDepartment(@RequestBody DepartmentModel departmentModel) {
		return this.departmentService.updateDepartment(departmentModel);
	}
	
}

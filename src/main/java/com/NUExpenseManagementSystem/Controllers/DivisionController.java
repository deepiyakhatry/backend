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

import com.NUExpenseManagementSystem.Models.DivisionModel;
import com.NUExpenseManagementSystem.Services.DivisionService;

@RestController
@RequestMapping(value="/api/division")
public class DivisionController {
	
	@Autowired
	private DivisionService divisionService;
	
	@GetMapping("/search")
	public List<DivisionModel> getDivisionList() {
		return this.divisionService.getDivisionList();
	}
	
	@GetMapping("/search/{searchId}")
	public DivisionModel getSingleDivision(@PathVariable String searchId) {
		return this.divisionService.getSingleDivision(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public DivisionModel registerDivision(@RequestBody DivisionModel divisionModel) {
		return this.divisionService.registerDivision(divisionModel);
	}
	
	@PutMapping("/update")
	public DivisionModel updateDivision(@RequestBody DivisionModel divisionModel) {
		return this.divisionService.updateDivision(divisionModel);
	}
	
}

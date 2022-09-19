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

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Services.ExpenseService;

@CrossOrigin
@RestController
@RequestMapping(value="/api/expense")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/search")
	public List<ExpenseInfoModel> getExpense() {
		return this.expenseService.getExpense();
	}
	
	@GetMapping("/search/{searchId}")
	public ExpenseInfoModel getExpenseList(@PathVariable String searchId) {
		return this.expenseService.getExpenseList(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public ExpenseInfoModel registerExpense(@RequestBody ExpenseInfoModel expenseInfoModel) {
		return this.expenseService.registerExpense(expenseInfoModel);
	}
	
	@PutMapping("/update")
	public ExpenseInfoModel updateExpense(@RequestBody ExpenseInfoModel expenseInfoModel) {
		return this.expenseService.updateExpense(expenseInfoModel);
	}
	
	
}

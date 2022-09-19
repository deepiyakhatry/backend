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

import com.NUExpenseManagementSystem.Models.ExpenseCategory;
import com.NUExpenseManagementSystem.Services.ExpenseCatService;

@RestController
@RequestMapping("/api/expensecat")
public class ExpenseCategoryController {
	
	@Autowired
	private ExpenseCatService expenseCatService;
	
	@GetMapping("/search")
	public List<ExpenseCategory> getExpenseCat() {
		return this.expenseCatService.getExpenseCat();
	}
	
	@GetMapping("/search/{searchId}")
	public ExpenseCategory getExpenseCatList(@PathVariable String searchId) {
		return this.expenseCatService.getExpenseCatList(Long.parseLong(searchId));
	}
	
	@PostMapping("/register")
	public ExpenseCategory registerExpenseCat(@RequestBody ExpenseCategory expenseCategory) {
		return this.expenseCatService.registerExpenseCat(expenseCategory);
	}
	
	@PutMapping("/update")
	public ExpenseCategory updateExpenseCat(@RequestBody ExpenseCategory expenseCategory) {
		return this.expenseCatService.updateExpenseCat(expenseCategory);
	}
	
}
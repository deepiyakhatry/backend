package com.NUExpenseManagementSystem.Services;


import java.util.List;

import com.NUExpenseManagementSystem.Models.ExpenseCategory;

public interface ExpenseCatService {
		
	public List<ExpenseCategory> getExpenseCat();
	
	public ExpenseCategory getExpenseCatList(Long searchId);
	
	public ExpenseCategory registerExpenseCat(ExpenseCategory expenseCategory);
	
	public ExpenseCategory updateExpenseCat(ExpenseCategory expenseCategory);

}
package com.NUExpenseManagementSystem.Services;


import java.util.List;

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;

public interface ExpenseService {
	
	public List<ExpenseInfoModel> getExpense();
	
	public ExpenseInfoModel getExpenseList(long searchId);
	
	public ExpenseInfoModel registerExpense(ExpenseInfoModel expenseInfoModel);
	
	public ExpenseInfoModel updateExpense(ExpenseInfoModel expenseInfoModel);

	
}

package com.NUExpenseManagementSystem.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;
import com.NUExpenseManagementSystem.Repository.ExpenseRepository;

@Service
public class ExpenseServicelmpl implements ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public List<ExpenseInfoModel> getExpense() {
		return expenseRepository.findAll();
	}
	
	@Override
	public ExpenseInfoModel getExpenseList(long searchId) {
		return expenseRepository.findById(searchId).get();
	
	}
	
	@Override
	public ExpenseInfoModel registerExpense(ExpenseInfoModel expenseInfoModel) {
		expenseRepository.save(expenseInfoModel);
		return expenseInfoModel;
	}
	
	@Override
	public ExpenseInfoModel updateExpense(ExpenseInfoModel expenseInfoModel) {
		expenseRepository.save(expenseInfoModel);
		return expenseInfoModel;
	}
	
}

	
	 

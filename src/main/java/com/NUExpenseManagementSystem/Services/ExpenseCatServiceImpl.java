package com.NUExpenseManagementSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NUExpenseManagementSystem.Models.ExpenseCategory;
import com.NUExpenseManagementSystem.Repository.ExpenseCategoryRepository;


@Service
public class ExpenseCatServiceImpl implements ExpenseCatService {
	
	@Autowired
	private ExpenseCategoryRepository expenseCategoryRepository;
	
	public ExpenseCatServiceImpl() {
	}
	
	@Override
	public List<ExpenseCategory> getExpenseCat() {
		return expenseCategoryRepository.findAll();
	}

	@Override
	public ExpenseCategory getExpenseCatList(Long searchId) {
		return expenseCategoryRepository.findById(searchId).get();
	}

	@Override
	public ExpenseCategory registerExpenseCat(ExpenseCategory expenseCategory) {
		expenseCategoryRepository.save(expenseCategory);
		return expenseCategory;
	}

	@Override
	public ExpenseCategory updateExpenseCat(ExpenseCategory expenseCategory) {
		expenseCategoryRepository.save(expenseCategory);
		return expenseCategory;
	}

}

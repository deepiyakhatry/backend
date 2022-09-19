package com.NUExpenseManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.NUExpenseManagementSystem.Models.ExpenseCategory;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long>{

}

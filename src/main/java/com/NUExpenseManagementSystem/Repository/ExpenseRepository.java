package com.NUExpenseManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.NUExpenseManagementSystem.Models.ExpenseInfoModel;

public interface ExpenseRepository extends JpaRepository<ExpenseInfoModel, Long>{

}
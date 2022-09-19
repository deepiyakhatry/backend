package com.NUExpenseManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NUExpenseManagementSystem.Models.DepartmentModel;

public interface DepartmentRepository extends JpaRepository<DepartmentModel, Long> {

}

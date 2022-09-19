package com.NUExpenseManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NUExpenseManagementSystem.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
        
}

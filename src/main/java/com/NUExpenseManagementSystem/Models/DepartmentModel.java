
package com.NUExpenseManagementSystem.Models;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department")
public class DepartmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long department_id;
	private String department_name;
	private Boolean auth_user_edit;
	private Boolean auth_expense_category;
	private Boolean auth_payment_edit;
	private Boolean del_flg;
		
}


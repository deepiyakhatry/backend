package com.NUExpenseManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="ExpenseCategory")
public class ExpenseCategory {
      
	  @Id
	  @GeneratedValue
	  private Long expense_cat_id;
	  private String expense_category_name;
	  private Boolean transport_flg;
	  private Boolean del_flg;
	  
}

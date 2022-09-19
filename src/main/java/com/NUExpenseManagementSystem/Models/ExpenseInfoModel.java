package com.NUExpenseManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;





@Data
@Entity
@Table (name="Expense")
public class ExpenseInfoModel {
	
	
	@Id
	@GeneratedValue
	
	private long id;
    private String dept_name;
    private String division;
    private String account;
    private String summary;
    private String payment_status;
    private String arrival_station;
    private String getting_off_station;
    private Number amount;
    private String note;
   
    
}
    

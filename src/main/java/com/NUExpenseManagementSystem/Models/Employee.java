package com.NUExpenseManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Employee")
public class Employee {

          @Id
          @GeneratedValue
          private Long staff_id;
          private String staff_pswd;
          private String staff_name;
          private String staff_kana;
          private Integer department_id;
          private Integer division_id;
          private String staff_email;
          private Boolean manager_flg;
          private Boolean del_flg;	

}

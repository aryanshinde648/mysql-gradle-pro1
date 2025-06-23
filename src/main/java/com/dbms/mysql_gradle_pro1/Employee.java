package com.dbms.mysql_gradle_pro1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor // default
@ToString
@EqualsAndHashCode
public class Employee {
    
	private Integer empId;
	private String empName;
	private String department;
	private double salary;
	
	
}

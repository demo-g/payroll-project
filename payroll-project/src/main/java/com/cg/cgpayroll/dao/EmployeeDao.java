package com.cg.cgpayroll.dao;

import com.cg.cgpayroll.dto.Employee;

public interface EmployeeDao {
	
	Employee store(Employee emp);
	
	Employee findById(int id);
	

}

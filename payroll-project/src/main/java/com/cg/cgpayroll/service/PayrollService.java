package com.cg.cgpayroll.service;

import com.cg.cgpayroll.dto.Employee;

public interface PayrollService {
	
	
	int acceptEmployeeDetails(Employee emp);
	Employee getEmployeeDetails(int id);
	
	
}

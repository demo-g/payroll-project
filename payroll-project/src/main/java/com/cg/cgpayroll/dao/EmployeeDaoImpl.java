package com.cg.cgpayroll.dao;

import com.cg.cgpayroll.dto.Employee;
import com.cg.cgpayroll.util.PayrollUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	public Employee store(Employee emp) {
		// TODO Auto-generated method stub
		emp.setId(PayrollUtil.getEMPLOYEE_ID_COUNTER());
		PayrollUtil.employees.put(emp.getId(), emp);
		return emp;
	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return PayrollUtil.employees.get(id);
	}


}

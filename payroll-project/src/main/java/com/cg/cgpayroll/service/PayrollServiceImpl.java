package com.cg.cgpayroll.service;

import com.cg.cgpayroll.dao.EmployeeDao;
import com.cg.cgpayroll.dao.EmployeeDaoImpl;
import com.cg.cgpayroll.dto.Employee;

public class PayrollServiceImpl implements PayrollService{

	private EmployeeDao empDao;
	public PayrollServiceImpl() {
		empDao=new EmployeeDaoImpl();
	}
	public int acceptEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		emp=empDao.store(emp);
		return emp.getId();
	}

	public Employee getEmployeeDetails(int id) 
	{
		// TODO Auto-generated method stub
		return empDao.findById(id);
	}

	
	
	

}

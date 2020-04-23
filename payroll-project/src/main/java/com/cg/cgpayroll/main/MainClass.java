package com.cg.cgpayroll.main;


import java.util.Arrays;

import com.cg.cgpayroll.dto.BankDetails;
import com.cg.cgpayroll.dto.Employee;
import com.cg.cgpayroll.dto.Salary;
import com.cg.cgpayroll.service.PayrollService;
import com.cg.cgpayroll.service.PayrollServiceImpl;

public class MainClass {

	public static void main(String[] args)  {
		
	PayrollService payrollService=new PayrollServiceImpl();
	BankDetails bkdetails=new BankDetails(24890124,"EFSKFKDFK","IDFC");
	Salary sal=new Salary(20000,2400,300); 
	Employee emp=new Employee(bkdetails,sal,303,5001,"James","Gostling","FS","Consultant","ENGLSOP","semi@gmail.com");
	int empId=payrollService.acceptEmployeeDetails(emp);
			payrollService.getEmployeeDetails(empId);
	System.out.println("Employee Details:  "+emp.toString());
	

	
	
	}

}

package com.cg.cgpayroll.util;

import java.util.HashMap;

import com.cg.cgpayroll.dto.Employee;

public class PayrollUtil {

	public static int EMPLOYEE_ID_COUNTER=100;
	public static HashMap<Integer,Employee> employees=new HashMap<Integer, Employee>();
	public static int getEMPLOYEE_ID_COUNTER()
	{
		return ++EMPLOYEE_ID_COUNTER;
	}
	
	
}

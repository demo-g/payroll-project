package com.cg.cgpayroll.dto;

public class Salary {
	private int basicSalary;
	private int hra;
	private int conveyenceAllowance;
	private int otherAllowance;
	private int personalAllowance;
	private int monthlyTax;
	private int epf;
	private int companyPf;
	private int netSalary;
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}
	
	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
	}

	public Salary(int basicSalary, int hra, int conveyenceAllowance,
			int otherAllowance, int personalAllowance, int monthlyTax,
			int epf, int companyPf, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.netSalary = netSalary;
	}
	public void displaySalary()
	{
		System.out.println(this.basicSalary+" "+this.hra+" "+this.conveyenceAllowance+" "+this.otherAllowance+" "+this.personalAllowance+" "+this.monthlyTax+" "+this.epf+" "+this.companyPf+" "+this.netSalary);
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}
	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	

}

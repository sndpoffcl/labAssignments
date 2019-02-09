package com.cg.eis.bean;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public String empDesig;
	public String empIns;
	
	public Employee(){};
	
	
	public Employee(int empId, String empName, double empSalary,
			String empDesig, String empIns) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesig = empDesig;
		this.empIns = empIns;
	}


	
	public String dispEmpInfo() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", empDesig=" + empDesig
				+ ", empIns=" + empIns + "]";
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		EmployeeException checkSal = new EmployeeException();
		if(checkSal.checkException(empSalary)==0)
		{
			this.empSalary = empSalary;
		}
		else
		{
			this.empSalary = empSalary;
		}
	}


	public String getEmpDesig() {
		return empDesig;
	}


	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}


	public String getEmpIns() {
		return empIns;
	}


	public void setEmpIns(String empIns) {
		this.empIns = empIns;
	}
	
	
}

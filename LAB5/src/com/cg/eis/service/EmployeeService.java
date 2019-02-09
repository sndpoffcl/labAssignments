package com.cg.eis.service;

public interface EmployeeService {
	void findEmpIns(double salary , String designation);
	double findEmpTax(double salary);
	int findEmpAge(int empId);
}

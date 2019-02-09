package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplementation;

public class EmployeeFunctionsClientDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String empName = sc.nextLine();
		System.out.println("Enter employee id");
		int empId = sc.nextInt();
		System.out.println("Enter employee designation");
		String empDesig = sc.next();
		System.out.println("Enter employee salary");
		double empSal = sc.nextDouble();
		
		Employee emp1 = new Employee();
		emp1.setEmpName(empName);
		emp1.setEmpId(empId);
		emp1.setEmpDesig(empDesig);
		emp1.setEmpSalary(empSal);
		
		EmployeeServiceImplementation empServices = new EmployeeServiceImplementation();
		
		empServices.findEmpIns(emp1.getEmpSalary() , emp1.getEmpDesig());
		
		emp1.dispEmpInfo();
		sc.close();
		
	}
}

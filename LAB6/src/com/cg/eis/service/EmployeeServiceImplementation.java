package com.cg.eis.service;

public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public void findEmpIns(double salary , String designation) {
		if(salary>=5000 && salary<20000 && designation.equals("System Associate"))
		{
			System.out.println("Scheme C");
		}
		else if(salary>=20000 && salary <40000 && designation.equals("Programmer"))
		{
			System.out.println("Scheme B");
		}
		else if(salary>=40000 && designation.equals("Manager"))
		{
			System.out.println("Scheme A");
		}
		else
		{
			System.out.println("No scheme");
		}
		
	}

	@Override
	public double findEmpTax(double salary) {
		if(salary<50000)
		{
			return (salary*0.2);
		}
		else if(salary>=100000)
		{
			return (salary*0.3);
		}
		else
		{
			return 0;
		}
	}

	@Override
	public int findEmpAge(int empId) {
		if(empId<100)
		{
			return 50;
		}
		else if(empId>=100 && empId<=200)
		{
			return 30;
		}
		else
		{
			return 20;
		}
	}


		
	}

	

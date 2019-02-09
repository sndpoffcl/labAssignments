package com.cg.eis.exception;

class MyException2 extends Exception
{
	
	
}
public class EmployeeException {
	public int checkException(double salary)
	{
		if(salary<3000)
		{
			try
			{
				throw new MyException2();
			}
			catch(MyException2 ex)
			{
				System.out.println("Exception caught - salary less than 3000");
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

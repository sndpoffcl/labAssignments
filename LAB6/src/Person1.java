
enum Gender
{
	M,F,NA;
}
class MyException extends Exception
{
	
}
public class Person1 {
	String firstName;
	String lastName;
	Gender gender;
	double phoneNumber;
	
	Person1(){
		firstName = "";
		lastName = "";
		gender= Gender.NA;
		phoneNumber = 0;
	}
	
	Person1(String first, String last, Gender g, double phone){
		
		firstName = first;
		lastName = last;
		gender= g;
		phoneNumber = phone;
	}
	public void setFirstName(String first)
	{
		if(first=="")
		{
			try
			{
				throw new MyException();
			}
			catch(MyException ex)
			{
				System.out.println("Exception caught = FirstName Blank" + ex);
			}
			
		}
		else
		{
		firstName = first;
		}
	}
	public void setLastName(String last)
	{
		if(last.equals(""))
		{
			try
			{
				throw new MyException();
			}
			catch(MyException ex)
			{
				System.out.println("Exception caught = LastName Blank " + ex);
			}
			
		}
		else
		{
			lastName = last;
		}
	}
	public void setGender(Gender g)
	{
		gender = g;
	}
	public void setPhoneNumber(double phone)
	{
		phoneNumber = phone;
	}
	
	public void dispfirstName()
	{	
		System.out.println("First Name : " + firstName);
		
	}
	public void dispLastName()
	{
		System.out.println("Last Name : " + lastName);
	}
	public void dispPhoneNumber()
	{
		System.out.println("Phone Number : " + phoneNumber);
	}
		
	public void dispGender()
	{
		System.out.println("Gender : " + gender);
	}
}

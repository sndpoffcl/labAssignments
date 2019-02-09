
enum Gender
{
	M,F,NA;
}
public class Person {
	String firstName;
	String lastName;
	Gender gender;
	double phoneNumber;
	
	Person(){
		firstName = "";
		lastName = "";
		gender= Gender.NA;
		phoneNumber = 0;
	}
	
	Person(String first, String last, Gender g, double phone){
		
		firstName = first;
		lastName = last;
		gender= g;
		phoneNumber = phone;
	}
	public void setFirstName(String first)
	{
		firstName = first;
	}
	public void setLastName(String last)
	{
		lastName = last;
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


class MyException1 extends Exception
{
	
}

public class Person2 {
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=15)
		{
			try
			{
				throw new MyException1();
				
			}
			catch(MyException1 ex)
			{
				System.out.println("Age caught less than 16 - Exception Caught");
			}
		}
		else{
		this.age = age;
		}
		}
	
	
}

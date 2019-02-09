import java.util.Scanner;


public class UserNameValidate {
	public static void main(String[] args)
	{
		validateUsername();
		
	}

	private static boolean validateUsername() {
		String username;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert username");
		username = sc.nextLine();
		sc.close();
		if( (checkEnd(username)) && ( checkLength(username)))
		{
			System.out.println("true");
			return true;
			
		}
		else
		{
			System.out.println("false");
			return false;
		}
	}
	public static boolean checkEnd(String username)
	{	
		
		if(username.substring(((username.length())-4),username.length()).equals("_job"))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
		
	}
	
	public static boolean checkLength(String username)
	{
		if( username.length()>11)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}

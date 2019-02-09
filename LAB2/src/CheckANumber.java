
public class CheckANumber {
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		if(n>0)
		{
			System.out.println( n + " is a positive number");
		}
		else if(n<0)
		{
			System.out.println( n + " is a negative number");
		}
		else
		{
			System.out.println(n + " is zero 0");
		}
	}
}

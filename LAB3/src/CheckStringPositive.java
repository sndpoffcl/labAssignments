import java.util.Arrays;
import java.util.Scanner;


public class CheckStringPositive {
	public static boolean checkString(String str)
	{
		char[] strCharArray = str.toCharArray();
		char[] sortedStrCharArray = str.toCharArray();
		Arrays.sort(sortedStrCharArray);
		for(int i=0;i<sortedStrCharArray.length;i++)
		{
			if(strCharArray[i] != sortedStrCharArray[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string ");
		str= sc.nextLine();
		if(checkString(str))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		sc.close();
	
	}
}

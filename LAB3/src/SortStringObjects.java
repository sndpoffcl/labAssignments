import java.util.Arrays;
import java.util.Scanner;


public class SortStringObjects {
	public static void sortString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int number = sc.nextInt();
		String[] str = new String[++number];
		
		System.out.println("Enter the strings");
		for(int i=0;i<str.length;i++)
		{
			str[i] = sc.nextLine();
		}
		Arrays.sort(str);
		if(str.length%2==0)
		{
			for(int i=0; i<(str.length/2); i++)
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=(str.length/2);i<str.length; i++)
			{
				str[i]=str[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0; i<((str.length+1)/2); i++)
			{
				str[i]=str[i].toUpperCase();
			}
			for(int i=((str.length+1)/2);i<str.length; i++)
			{
				str[i]=str[i].toLowerCase();
			}
		}
		
		System.out.println("*********STRING IN ALPHABETICAL ORDER****************");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		sc.close();
	}
	
	public static void main(String[] args)
	{
		sortString();
	}
}

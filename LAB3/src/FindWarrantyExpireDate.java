
import java.util.Scanner;



public class FindWarrantyExpireDate {
	public static void findWarranty()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day of purchase");
		int dayOfPurchase = sc.nextInt();
		System.out.println("enter the month of purchase");
		int monthOfPurchase = sc.nextInt();
		System.out.println("enter the year of purchase");
		int yearOfPurchase = sc.nextInt();
		
		System.out.println("enter the months of warranty");
		int monthsOfWarranty = sc.nextInt();
		
		System.out.println("enter the years of warranty");
		int yearsOfWarranty = sc.nextInt();
		
		int yearOfExp = yearOfPurchase + yearsOfWarranty;
		int monthOfExp = monthOfPurchase + monthsOfWarranty;
		
		if(monthOfExp > 12 )
		{
			monthOfExp = monthOfExp -12 ;
			yearOfExp++;
		}
		
		sc.close();
		
		System.out.println("Date of Expiration :" + dayOfPurchase + "/" + monthOfExp + "/" + yearOfExp );
		
	}
	public static void main(String[] args)
	{
		findWarranty();
	}
}

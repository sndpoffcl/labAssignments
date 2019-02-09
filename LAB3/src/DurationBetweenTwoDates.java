import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class DurationBetweenTwoDates {
	public static void checkDuration()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first date in dd/MM/yyyy");
		String date1Str = sc.nextLine();
		System.out.println("enter the second date in dd/MM/yyyy");
		String date2Str = sc.nextLine();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		

		try {
		    java.util.Date date1 = null;
			try {
				date1 = dateFormat.parse(date1Str);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    java.util.Date date2 = null;
			try {
				date2 = dateFormat.parse(date2Str);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    long diff = date2.getTime() - date1.getTime();
		   // int days =  (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		sc.close();

	}
	
	public static void main(String[] args)
	{
		checkDuration();
	}
}

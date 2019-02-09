import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CheckDurationWithSystemTime {
	public static void checkDuration()
	{
		String userDateStr; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in dd/mm/yyyy ");
		userDateStr = sc.nextLine();
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now(); 
		String systemDateStr = dtf.format(now);  
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		    java.util.Date userDate = null;
			try {
				userDate = dateFormat.parse(userDateStr);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    java.util.Date systemDate = null;
			try {
				systemDate = dateFormat.parse(systemDateStr);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    long diff = systemDate.getTime() - userDate.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		    sc.close();
		}
		
		
	}
	public static void main(String[] args)
	{
		 checkDuration();
	}
}

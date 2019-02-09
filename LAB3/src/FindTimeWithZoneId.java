import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;


public class FindTimeWithZoneId {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter time zone");
	String timeZoneId = sc.nextLine();
	getTime(timeZoneId);
	sc.close();
}

public static void getAllTimeZone()
{
	String[] zoneIds = TimeZone.getAvailableIDs();
	for(int i=0;i<zoneIds.length;i++)
	{
		TimeZone tz = TimeZone.getTimeZone(zoneIds[i]);
		System.out.println(tz.getID() + " " + tz.getDisplayName() );
	}
}

public static void getTime(String timeZoneID)
{
	Calendar calTZ = new GregorianCalendar(TimeZone.getTimeZone(timeZoneID));
	calTZ.setTimeInMillis(new Date().getTime());
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.YEAR , calTZ.get(Calendar.YEAR));
	cal.set(Calendar.MONTH, calTZ.get(Calendar.MONTH));
	cal.set(Calendar.DAY_OF_MONTH, calTZ.get(Calendar.DAY_OF_MONTH));
	cal.set(Calendar.HOUR_OF_DAY, calTZ.get(Calendar.HOUR_OF_DAY));
	cal.set(Calendar.MINUTE, calTZ.get(Calendar.MINUTE));
	cal.set(Calendar.SECOND, calTZ.get(Calendar.SECOND));
	cal.set(Calendar.MILLISECOND, calTZ.get(Calendar.MILLISECOND));
	System.out.println(cal.getTime());
	

	
}
}

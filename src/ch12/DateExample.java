package ch12;

import java.util.Calendar;
import java.util.TimeZone;

public class DateExample {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		System.out.println(date);
		System.out.println(date.getTime()); // db에서 사용하는 형식이 아님
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(date2);
		System.out.println(System.currentTimeMillis());
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar cal = Calendar.getInstance(tz);
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)); //1월은 0
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		for(String id:TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}
	}
}

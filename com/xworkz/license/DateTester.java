package com.xworkz.license;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTester {

	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
		String StringDate=format.format(date);
		System.out.println(StringDate);
		
		SimpleDateFormat format1=new SimpleDateFormat("MM-dd-yyyy");
		String stringDate=format1.format(date);
		System.out.println(StringDate);
		
		SimpleDateFormat format2=new SimpleDateFormat("MM-dd-yyyy");
		
		Date date2=format2.parse("11-08-1997");
		
		System.out.println(date2);

	}

}

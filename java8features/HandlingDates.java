package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("Today's Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time :"+currentDateTime);
		
		LocalDate ownDate = LocalDate.parse("2015-11-25"); //setting own date by parse()
		System.out.println("Setting my own date by passing String "+ownDate);
		
		LocalDate ownDate2 = LocalDate.of(2020, 4, 21);
		System.out.println("Setting own date by passing integer "+ownDate2);
		
		//accessing tomorrow's and yesterday's Date 
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's date :"+yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow date :"+tomorrow);
		
		//checking leap year 
		System.out.println("Is leap Year? "+currentDate.isLeapYear());
		
		//Changing date and time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("My own date format"+formattedDate);
		
		//handling zones
		ZonedDateTime currentZoneDateTime = ZonedDateTime.now();	
		System.out.println("date-time with zone :"+currentZoneDateTime);
		
		System.out.println("Current Zone :"+currentZoneDateTime.getZone());
		
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone = currentZoneDateTime.withZoneSameInstant(zoneId);
		System.out.println("Date for tokyo zone :"+tokyoZone);

	}

}

package com.java8.LocalDate;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimedemo {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		//System.out.println(dateTime.now());
		
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//System.out.println(dateTime.format(formatter));
		
		Month m = dateTime.getMonth();
		LocalDate date = LocalDate.of(1982, 7, 5);
		//System.out.println(date.getDayOfMonth());
		
		ZonedDateTime currentZone = ZonedDateTime.now();
		//System.out.println(currentZone.getZone());
		
		ZoneId id = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(id);
		
		DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String tokyo = format.format(tokyoZone);
		//System.out.println(tokyo);
		
		LocalDate afterFiveDays = LocalDate.of(2023,Month.APRIL,26);
		Period gap = Period.between(localDate, afterFiveDays);
		//System.out.println(gap.toString());
		
		
		LocalTime time1 = LocalTime.now();
		//System.out.println(time1);
		Duration fiveHours = Duration.ofHours(5);
		LocalTime t2 = time1.plus(fiveHours);
		//System.out.println(time1.plus(fiveHours));
		
		Duration d = Duration.between(time1, t2);
		//System.out.println(d);
		
		//ChronoUnit Enums
		
		LocalDate y = localDate.plus(1, ChronoUnit.DECADES);
		
		//System.out.println(y);
		
		//Temporary Adjusters
		
		LocalDate dayofMonth = localDate.with(TemporalAdjusters.
                firstDayOfNextMonth());
		//System.out.println(dayofMonth);
		
		LocalDate nextSaturday = localDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println(nextSaturday);
	}

}

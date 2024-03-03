package com.java8;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateEx1 {
	
	public static void main(String[] args) {
		
		//age calculator
		
		LocalDate birthdate = LocalDate.of(1998, 12, 02);
		
		LocalDate  currentdate = LocalDate.now();
		
		System.out.println(currentdate);
		
		Period p = Period.between(birthdate, currentdate);
		
		System.out.printf("your age is %d years ,%d months ,%d days",p.getYears(),p.getMonths(),p.getDays());
	
	//zonal timings
		
		System.out.println();
		System.out.println("*************");
		
		ZoneId zone =  ZoneId.of("US/Eastern");
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
//		for(Object obj:zone.getAvailableZoneIds()) {
//		
//		System.out.println(obj);
//	
//		}
	System.out.println(zt);
	
	}

}

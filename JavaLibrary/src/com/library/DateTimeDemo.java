package com.library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {


		LocalDate  date =	LocalDate.now();
		
		System.out.println(date);
		
			System.out.println("year "+date.getYear());
			System.out.println("month "+date.getMonth());
			System.out.println("week day "+date.getDayOfWeek());
		System.out.println("day of year "+date.getDayOfYear());
		
		
			System.out.println(date.minusMonths(1));
			System.out.println(date.plusMonths(1));
			
			System.out.println(date.plusWeeks(6));
		
			
			
		
		
		
			LocalDate date2 = LocalDate.of(1947,8, 15);
			
			System.out.println(date2.getDayOfWeek());
			
			
				String str = "19/06/1990";
				
			DateTimeFormatter formatter =	DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
			LocalDate  mydate =	LocalDate.parse(str,formatter);
			
				System.out.println(mydate);
			
		

	}

}

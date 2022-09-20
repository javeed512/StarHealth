package com.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {


		List<Integer> salaries = new ArrayList<Integer>();
		
		
		  salaries.add(30000); salaries.add(50000); salaries.add(20000);
		  salaries.add(40000); salaries.add(10000); salaries.add(60000);
		 
		
		
			Stream<Integer> stream = 	salaries.stream();
			
	 Optional<Integer> optional =  stream.max((sal1,sal2)->{return Integer.compare(sal1,sal2);});
						
			
	 		if(optional.isPresent()) {
	 			
	 			System.out.println("Max "+optional.get());
	 			
	 		}
	 		
	 		else {
	 			
	 			System.out.println(optional.get());
	 			
	 		}
	 
			
	 		
	 		
	 		List<Integer> salaries2 = new ArrayList<Integer>();
			
			
			  salaries2.add(30000); salaries2.add(50000); salaries2.add(20000);
			  salaries2.add(40000); salaries2.add(10000); salaries2.add(60000);
	 		
		Stream<Integer> stream2 =	  salaries2.stream();
			  
			  
		Optional<Integer> op =	stream2.reduce((s1,s2)->{return s1+s2;});
		
			if(op.isPresent()) {
				
				
					System.out.println("Sum of Salaries "+op.get());
				
			}
		
			else {
				
				
				System.out.println(op.get());
				
			}

	}

}

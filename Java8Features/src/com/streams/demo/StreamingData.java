package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingData {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(10, 20, 30, 40, 50);

		stream1.forEach((Integer i) -> {
			System.out.println(i);
		});

		// stream1.forEach(System.out::println);

		String names[] = { "tom", "ford", "brown", "steve john", "rajendra prasad" };

		Stream<String> stream2 = Arrays.stream(names);
		/*
		 * stream2.filter((String name) -> { return name.length() > 4; }).forEach((name)
		 * -> { System.out.println(name); });
		 */
		
	List<String> newList =	stream2.filter((String name) -> {
			return name.length() > 4;
		}).collect(Collectors.toList());
		

			System.out.println(newList);
			
			
			List<String> list =   Arrays.asList(names);
			
			Stream<String> stream3 =	list.stream();
			
		stream3.map((String name)->{return name.toUpperCase();})
				.filter((name)-> {return name.length() >5 ;})
		             .forEach(System.out::println);
			
			
			
			
			
			
	
	}

}

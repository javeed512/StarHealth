package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {


		List<Object>  list = new ArrayList<Object>();
		
		//Collections.synchronizedList(list);
		
		list.add(33); // list.add(new Integer(33));
		list.add(4.55);
		list.add("javeed");
		list.add(new ListDemo());
		list.add(33);
		list.add(null);
		
		System.out.println(list);
		
		
		List<Integer>   list2 = new ArrayList<Integer>();
		
			list2.add(11);
			list2.add(55);
			list2.add(44);
			list2.add(22);
			
			System.out.println(list2);
			
			ListIterator<Integer> lit =	list2.listIterator();
		
				while (lit.hasNext()) {
					Integer i =  lit.next();
					
					System.out.println(i);
				}
				
				System.out.println("List Iterator");
				
				while(lit.hasPrevious()) {
					
				Integer j =	lit.previous();
					
					System.out.println(j);
				}	
			
		

	}

}

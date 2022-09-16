package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {


		List<Object>  list = new ArrayList<Object>();
		
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
			list2.add(11);
			
			System.out.println(list2);
		
		
		

	}

}

package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();

		list.add(101);
		list.add(105);
		list.add(103);
		list.add(106);
		list.add(104);
		list.add(101);

		list.add(1, 102);

		System.out.println(list);

		list.remove(1);

		System.out.println(list);

		for (Integer data : list) {

			System.out.println(data);

		}

		System.out.println("Iterator");
		
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			
			Integer  i = it.next();
			
			System.out.println(i);

		}

	}

}

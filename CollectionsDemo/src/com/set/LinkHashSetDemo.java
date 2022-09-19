package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		set.add("dragon fruit");
		set.add("banana");
		set.add("apple");
		set.add("carrot");
		set.add("apple");
		
		System.out.println(set);

	}

}

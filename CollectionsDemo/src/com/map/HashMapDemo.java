package com.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {


		Map<Integer,String>  map = new Hashtable<Integer,String>(); // Map<K,V>
		
			map.put(102, "tom");
			map.put(105, "adam");
			map.put(103, "smith");
			map.put(101, "tom");
			map.put(105,"javeed");// replacing old value with new value duplicate not allowed for keys
			map.put(107,null);
			
			System.out.println(map);
			
			System.out.println(map.keySet());
			System.out.println(map.values());
			
			
			System.out.println(map.get(103));
		
			
		Set<Integer>  keySet =	map.keySet();
			
		
			for (Integer key : keySet) {
				
				System.out.println(key +" "+ map.get(key));
				
			}
		
		
		
	}

}

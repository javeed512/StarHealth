package com.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("data.properties");
	
					prop.load(fis);
		
				String	uname =	prop.getProperty("username");
				
				String pwd = prop.getProperty("password");
				
				String city = prop.getProperty("city.name");
				
				System.out.println(uname +" "+ pwd+"  "+city);
				
				String mno = prop.getProperty("mobileno");
				
				System.out.println(mno);
				
				
			Set<Object>  keySet =	prop.keySet();
						
			for (Object key : keySet) {
				
				
				
			String value = (String)	prop.get(key);
			System.out.println(key  + " "+ value);
				
			}
				
				
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

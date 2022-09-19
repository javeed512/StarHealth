package com.keyboard;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {


		try {
			FileReader reader = new FileReader("input.txt");
			
			
			int n =0;
			while((n =	reader.read()) != -1 ) {
				
				System.out.print((char)n);
				
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

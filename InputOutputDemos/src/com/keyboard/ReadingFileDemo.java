package com.keyboard;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {


		try {
			FileReader reader = new FileReader("input.txt");
			
			FileWriter  writer = new FileWriter("output.txt");
			
			int n =0;
			while((n =	reader.read()) != -1 ) {
				
						writer.write(n);
						
						writer.flush();
				
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

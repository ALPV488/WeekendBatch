package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\weekend.txt");
		
		fw.write(2343);
		
		fw.write("good \n morning");
		
		fw.write('g');
		
		char[] ch= {'c','a','d','t'};
		
		fw.write(ch);
		
//		fw.write(true);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("file is created and written successfully");
	}

	//FileWriter:-
	
	//(1)Not accepting some datatypes
	
	//(2)No new line
	
}

package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\weekend.txt");
		
		int i =fr.read();
		
		while(i !=-1) {
			
			i=fr.read();
			
			System.out.println((char)i);
			
		}
		System.out.println("file is read successfully");
		
		
	}
	
	//-1 =>end of the line
}

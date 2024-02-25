package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\weekend.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("good \n morning");
		
		pw.println(1234);
		
		pw.println('c');
		
		pw.println(true);
		
		char ch[]= {'c','a','c','d'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("written into the file sucessfully");
		
	}
	//FileWriter:-
	
		//(1)Not accepting some datatypes
		
		//(2)No new line
}

package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\PRADEEP GOUD\\Desktop\\weekend.txt");
		
		System.out.println(file.isFile());
		
		System.out.println(file.createNewFile());
		
		System.out.println(file.isFile());
		
		System.out.println("file is created successfully");
	}

}

package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee(1234,"java",9387493,"hyderabad");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Employee.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fo);
		
		obj.writeObject(emp);
		
		obj.flush();
		
		System.out.println("written into the file successfully");
		
		
	}

}

package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Employee.txt");
		
		ObjectInputStream obj = new ObjectInputStream(fi);
		
		Object object =  obj.readObject();
		
		System.out.println(object);
		
	}

}

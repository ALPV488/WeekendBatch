package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\weekend.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(2343);

		bw.newLine();

		bw.write("good \n morning");

		bw.newLine();

		bw.write('g');

		bw.newLine();

		char[] ch = { 'c', 'a', 'd', 't' };

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("file is created and written successfully");

	}

}

package com.intro;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numerator:-");
		
		int x = scan.nextInt();
		
		System.out.println("Enter the denominator:-");
		
		int y = scan.nextInt();
		
		System.out.println("numerator:-" +x +"             denominator:-"+y);
		
		int result = x/y;
		
		System.out.println("the result is:-" +result);
		
	}
}

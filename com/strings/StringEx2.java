package com.strings;

public class StringEx2 {

	public static void main(String[] args) {

		String name = "apple";

		String name1 = "apple";

		String name2 = "apple";

		System.out.println(name1 == name2);// true

		System.out.println(name1.equals(name2));// true

		System.out.println(name1.compareTo(name2));// 0

		System.out.println(name1.equalsIgnoreCase(name2));// true

		String name3 = new String("apple");

		String name4 = new String("apple");

		System.out.println(name3 == name4);// true

		System.out.println(name3.equals(name4));// true

		System.out.println(name3.compareTo(name4));// 0

		System.out.println(name3.equalsIgnoreCase(name4));//true
		
		StringBuffer name5 = new StringBuffer("apple");
		
		StringBuffer name6 = new StringBuffer("apple");
		
		System.out.println("***********");
		
		System.out.println(name5 == name6);// true

		System.out.println(name5.equals(name6));// true

		System.out.println(name5.compareTo(name6));// 0

	
		

	}

}

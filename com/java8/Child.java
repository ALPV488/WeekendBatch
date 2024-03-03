package com.java8;

public interface Child {
	
	public default void dispaly() {			//can be overrided
		System.out.println("Iam from interface default method");
	}

	public static void dispalyMsg() {				//can't be overrided 
		System.out.println("Iam from interface static method");			//security  for the implementation
	}
	

}

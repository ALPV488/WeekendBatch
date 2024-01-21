package com.oops;

public class MethodOverloading {

	public void add(char a, char b) {
		System.out.println("6.The sum of two integers is:-" + a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println("11.the sum of three integers is:-" + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("15.the sum of one int and one float is:-" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("19.the sum of float and one int is:-" + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("23.the sum of two floats is :-" + (a + b));
	}
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add('a','b');
		
		
		
	}
}

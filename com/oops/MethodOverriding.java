package com.oops;

class Parent5 {

	public void Parent() {
		System.out.println("Iam from the Parent class");
	}

	public int add(int a, int b) {

		return (a + b);
	}

}

public class MethodOverriding extends Parent5 {
	

	public static void main(String[] args) {

		MethodOverriding obj = new MethodOverriding();

		obj.Parent();

		System.out.println(obj.add(2, 5));

	}
	
	@Override
	public void Parent() {
		System.out.println("Iam from the Child class");
	}

}

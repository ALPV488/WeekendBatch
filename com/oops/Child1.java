package com.oops;


class SuperParent{
	
	public void Hi() {
		System.out.println("Iam from super parent class");
	}
	
	public void add( int a,int b) {
		
		System.out.println("the sum is:-"+(a+b));
	}
	
}


class Parent1 extends SuperParent{
	

	public void displayMsg() {					//instance mtd
		
		System.out.println("Iam from the parent class");
	}
	
	public void add( int a,int b) {
		
		System.out.println("the sum is:-"+(a+b));
	}
	
}


public class Child1 extends Parent1{
	
	public static void main(String[] args) {
		
		Child1  obj = new Child1();
		
		obj.displayMsg();
		
		obj.add(12, 13);
		
		obj.Hi();
		
		
		
	}

}

package com.oops;//ctrl+shift+f  ==>to format the code

interface Parent2 {								//100% abstraction

	public void add(int a, int b);

}

interface Parent3 {

	public void add(int a, int b);
	
	
}
public class Child2 implements Parent2,Parent3 {				//no abstraction

	@Override
	public void add(int a, int b) {
	
		System.out.println("the sum is :-"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		
		obj.add(12, 13);
		
	}

}

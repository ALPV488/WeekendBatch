package com.java8;

@FunctionalInterface
interface Calculator {
	public abstract void add(int a, int b);		//instance
}

class Calculator1 implements Calculator {

	@Override
	public void add(int a, int b) {			//instance
		System.out.println("The sum of a and b " + (a + b));

	}

}

public class MethodRefEx {
	
	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		obj.add(2, 3);
		
		
		
		Calculator obj1 =(a,b)->System.out.println("The sum is :-"+(a+b));
		
		obj1.add(4,5);
		
		
		Calculator obj2 = new  Calculator1()::add;			//Method refrence
		
		obj2.add(5, 5);
		
		
	}
	

	

	

	

}

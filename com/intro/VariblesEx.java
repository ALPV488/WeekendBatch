package com.intro;

class VariblesEx {
	
	static int number1 = 56;		//global static var
	
	int number2 = 45;		//instance global var
	
	public static void main(String[] args) {
		
		int value1 = 45;				//local var
		
		int value2 = 67;
		
		int add = value1 + value2 ;
		
		System.out.println("add" + add);
		
		System.out.println(VariblesEx.number1);
		
		VariblesEx obj = new VariblesEx();		//object creation
		
		System.out.println(obj.number2);
		
		
		
		
	}

}

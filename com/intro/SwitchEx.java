package com.intro;

import java.util.Scanner;//import sc:-		ctrl+shift+o

public class SwitchEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your max marks:-");
		
		float mm = scan.nextFloat();
		
		System.out.print("Enter your obtained marks:-");
		
		float om = scan.nextFloat();
		
		float percentage = ((om/mm)*100);
		
		System.out.println("Percentage :-"+percentage);
		
		int value =(int) (( percentage/10)%10);
		
		
		System.out.println("gpa :-" + value);
		
		switch(value) {
		
		case 10:{
			
			System.out.println("distinction");
			break;
		}
		
		case 9:{
			
			System.out.println("excellent");
			break;
		}
		
		
		case 8:{
			
			System.out.println("good");
			break;
		}
		
		case 7:{
			System.out.println("well");
			break;
		}
		
		case 6:{
			System.out.println("imporve well");
			break;
		}
		
		case 5:{
			System.out.println("average");
			break;
		}
		
		default:{
			System.out.println("fail");
			break;
		}
		}
		
		
		
	}

}

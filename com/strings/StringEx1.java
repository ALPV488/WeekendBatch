package com.strings;

public class StringEx1 {
	
	public static void main(String[] args) {
		
			String name = "hyderabad";
			
//			System.out.println(name.concat(" biryani"));
			
			name.concat(" biryani");
			
//			System.out.println(name);
			
			StringBuffer str = new StringBuffer("Hyderabad");
			
			
			System.out.println(str);
			
			str.append(" biryani");
			
			System.out.println(str);
		
	}

}

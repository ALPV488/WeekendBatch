package com.strings;

public class MultiThreadingEx  implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println("Child Task");
		}
		
	}
	
	public static void main(String[] args) {
		
		MultiThreadingEx obj = new MultiThreadingEx();
		
		Thread  thread = new Thread(obj);
		
		thread.start();				//run method call
		
		for(int i=1;i<11;i++) {
			System.out.println("Main Task");
		}
		
	}
	
	

}

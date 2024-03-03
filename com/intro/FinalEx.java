class Parent1{
	
	final int value = 25;
	
	final public void display() {
		System.out.println("Iam from the parent calss method");
	}
}


public class FinalEx extends Parent1 {
	
	public static void main(String[] args) {
		
		FinalEx obj = new FinalEx();
		
//		obj.display();
		
//		obj.value= 23;
		
		System.out.println(obj.value);
	}
	
	

}

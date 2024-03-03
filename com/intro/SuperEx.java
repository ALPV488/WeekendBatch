class Parent{
	
	static String name ="apple";					//parent class static var
	
	public Parent() {								//parent class default constr
		System.out.println("Iam from the parent class constructor");
	}
	
	public Parent(String name) {					//parent class parmet constr
		System.out.println("The name is:-"+name);
	}
	
	
	public void display() {							//parent class method
		System.out.println("Iam from the parent class method");
	}
	
}


public class SuperEx extends Parent {
	
	static String name =" orange";					//child var
	
	public void display() {								//child method
		System.out.println("Iam from the Child class method");
		
		System.out.println(super.name);
		
		super.display();
	}
	
	public SuperEx() {				//child class costr
		
		super("Tulips");		//parent constr call
		
		System.out.println(super.name);			//parent class var
		
		super.display();				//parent class meth
		
		
	}
	
	public static void main(String[] args) {
		
	SuperEx obj = new SuperEx();		//constr calll
	
	
		
	}
	

}

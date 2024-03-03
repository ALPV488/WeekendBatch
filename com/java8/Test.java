package com.java8;

@FunctionalInterface
interface Flower {
	public abstract void flower(String name);
}

class Rose implements Flower {

	@Override
	public void flower(String name) {
		System.out.println("The flower name is:-" + name);

	}

}

public class Test {

	public static void main(String[] args) {

		Rose obj = new Rose();

		obj.flower("rose"); // calling interface method using method impl in separate class

		Flower obj1 = new Flower() {

			@Override
			public void flower(String name) {
				System.out.println("The flower is:-" + name);

			}
		};

		obj1.flower("Tulips"); // calling interface method using overrided through constr

		//()->{}
		
		Flower obj2 =  (name)->System.out.println("The name of the flower is:-"+name);
		
		obj2.flower("jasmine");    //calling interface method using lambda expression
		
		

	}

}

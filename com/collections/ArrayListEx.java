package com.collections;

import java.util.ArrayList;//1.parent->child
							//2.obj creation

//1.Homogenous/Heterogenous data can be accepted

//2.Array size is not fixed

//3.Lots of utility methods

//4.It will allow duplicates

//5.It will stores insertion order

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // [12,23,45,56,67]

		al.add(1333);

		al.add("Parashuram");

		al.add("Sai");

		al.add("Dasaradh");

		al.add(true);

		al.add(3.14f);

		System.out.println(al);

		al.add("Lakshmi");

		System.out.println(al);

		System.out.println(al.contains("apple"));

		System.out.println(al.get(3));

		System.out.println(al.indexOf("Lakshmi"));

		System.out.println("The lenght of an array is:-"+al.size());
		
		
	}

}

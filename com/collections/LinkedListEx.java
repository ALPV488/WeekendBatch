package com.collections;

import java.util.LinkedList;

//1.Homogenous/Heterogenous data can be accepted

//2.Array size is not fixed

//3.Lots of utility methods

//4.It will allow duplicates

//5.It will stores insertion order

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(1333);

		ll.add("Parashuram");

		ll.add("Sai");

		ll.add("Dasaradh");

		ll.add(true);

		ll.add(3.14f);

		System.out.println(ll);

		ll.add("Lakshmi");

		System.out.println(ll);
		
		
		
		

	}

}

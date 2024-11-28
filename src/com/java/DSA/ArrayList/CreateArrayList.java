package com.java.DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreateArrayList {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<Integer>();
	list1.add(10); // [ 10 ]
	list1.add(2);  // [ 10 , 2 ]
	list1.add(5);   // [ 10 , 2 , 5 ]
	list1.add(4);    //  [ 10 , 2 , 5 , 4 ]
	list1.add(3,6);  // 3 -> Index , 600 -> Element
	System.out.println("print all the list "+list1);  // print all the element of the list.
	
	// Using get method Acess the element  list.get(index);
	System.out.println("Elemnt is : "+list1.get(3));
	
	
	// get the size of array lsit { list.soze();
	System.out.println("Size : "+list1.size());

	// Set : a set method using set the value of the list index set 6 to 8;
	list1.set(3,8);  // 3 -> Index , 600 -> Element
	System.out.println(list1);
	
	
//	Remove : Remove the list element from the list.
	list1.remove(3);
	System.out.println(list1);
	System.out.println("Size : "+list1.size());

	
	// Print the arrylist element itarativally
	
	for(int i=0; i<list1.size();i++) {
		System.out.print(list1.get(i) +" ");
	}
	
	Collections.sort(list1);
	System.out.println("\nSorted list : "+ list1);
	
	
	// Array to be search;
	
	System.out.println(list1.contains(10));
}
}

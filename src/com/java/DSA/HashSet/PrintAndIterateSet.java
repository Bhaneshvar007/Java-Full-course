package com.java.DSA.HashSet;
import java.util.*;
public class PrintAndIterateSet {
public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.remove(4);
	System.out.println(set.contains(1));
	Iterator<Integer> it = set.iterator();
	while(it.hasNext()) { // Iterate the hashset.
		System.out.print(it.next()+" ");
	}
}
}

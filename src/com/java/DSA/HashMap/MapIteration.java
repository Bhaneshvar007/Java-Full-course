package com.java.DSA.HashMap;

import java.util.*;

public class MapIteration {
	public static void main(String[] args) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		System.out.println("Map Iteration");
		mp.put(2, 5); // put is the combination of key + value;
		mp.put(0, 4);
		mp.put(2, 3);
		for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
			System.out.println(i.getKey() + " -> " + i.getValue());
		}

	}

}

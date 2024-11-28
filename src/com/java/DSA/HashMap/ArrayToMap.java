package com.java.DSA.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
public static void main(String[] args) {
	HashMap<Integer,Integer> mp = new HashMap<>();

	int arr[] = {10,1,2,3,4,1,2,3,1,2,7,6,5,4,0,1,2,3};
//	int arr[] = {1,2,3,4,5,6};
	for(int i =0;i<arr.length;i++) {
		if(mp.containsKey(arr[i])) {
			mp.put(arr[i] , mp.get(arr[i])+1);
		}
		else {
			mp.put(arr[i] , 1);
		}
	}
	for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
		System.out.println(i.getKey() + " -> " + i.getValue());
	}
//	System.out.println(mp);
	
}
}
      
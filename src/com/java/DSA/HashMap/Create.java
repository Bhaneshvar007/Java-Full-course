package com.java.DSA.HashMap;
import java.util.*;
public class Create {
public static void main(String[] args) {
	HashMap<Integer,Integer> mp = new HashMap<>();
//	TreeMap<Integer,Integer> mp = new TreeMap<>();
	mp.put(1, 5); // put is the combination of key + value;
	mp.put(0, 4);
	mp.put(2, 3);
	System.out.println(mp);
//	mp.put(2, 10);  // updation
//	System.out.println(mp.size());
//	System.out.println(mp.get(2));
//	System.out.println(mp.remove(2));
	System.out.println(mp.get(2));
//	System.out.println(mp.containsKey(2)); // key is exist or not

}
}

package com.afterFedex.prac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String args[]) {
		// implementation of HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// addding keys and values to HashMap
		hm.put(2, "mahfuz");
		hm.put(1, "Yash");
		hm.put(5, "abrar");
		hm.put(4, "ifti");
		hm.put(17, "Arun");
		hm.put(15, "Swarit");
		hm.put(9, "Neelesh");
		hm.put(44, "foutryFour");
		hm.put(11, "Eleven");

		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Before Sorting");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
		System.out.println("\n");
//	Map<Integer, String> map=new HashMap<Integer, String>();  
		System.out.println("After Sorting");
		// using TreeMap constructor to sort the HashMap
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		Iterator itr = tm.keySet().iterator();
		while (itr.hasNext()) {
			int key = (Integer) itr.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
	}

//	// https://www.javatpoint.com/how-to-sort-hashmap-in-java
//	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(1, "Affirmation");
//		hm.put(5, "Opportunity");
//		hm.put(3, "Gratiute");
//		hm.put(4, "I am a millionaire");
//		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("p", "Affirmation");
//		map.put("k", "is");
//		map.put("t", "the ");
//		map.put("s", "only ");
//		
//		
//
//		System.out.println("@@@@@@@@@@@@@@");
//
//		for (Integer i : hm.keySet()) {
//
//			System.out.println(i + "  " + hm.get(i));
//		}
//
//		System.out.println("**********************");
//		System.out.println(hm.keySet() + "  " + hm.values());
//		System.out.println("######################");
//		for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
//			System.out.println(entry.getKey() + "  " + entry.getValue());
//
//		}
//	}
//
}

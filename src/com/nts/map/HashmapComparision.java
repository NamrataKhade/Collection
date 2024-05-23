package com.nts.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashmapComparision {
	public static void main(String args[]) {

		// map1
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		// map2
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		// map3
		HashMap<Integer, String> map3 = new HashMap<>();

		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//compare two maps using key and value
		//1.On the basis of key value pair :Use equals method
		System.out.println( map1.equals(map2));	//true
		System.out.println(map1.equals(map3)); //false
		
		//2.compare hashmaps for the same keys :KeySet
		
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		
		//3.Find out the extra key
		
		HashMap<Integer, String> map4=new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		//combine the key from both the maps:using HashSet.
		// Find extra key
		HashSet<Integer> combineKeySet = new HashSet<>(map1.keySet());
		//add the keySet from mp4
         System.out.println(combineKeySet);		
          combineKeySet.addAll(map4.keySet());
         System.out.println(combineKeySet);
         
         combineKeySet.removeAll(map1.keySet());
         System.out.println(combineKeySet);
         
         //compare map by value
         HashMap<Integer, String> map5 = new HashMap<>();
         map5.put(1, "A");
         map5.put(2, "B");
         map5.put(3, "C");

 		// map2
 		HashMap<Integer, String> map6 = new HashMap<>();
 		map6.put(3, "C");
 		map6.put(1, "A");
 		map6.put(2, "B");

 		// map3
 		HashMap<Integer, String> map7 = new HashMap<>();

 		map7.put(1, "A");
 		map7.put(2, "B");
 		map7.put(3, "C");
 		map7.put(4, "C");
 		
 		//Dublicated NOT allowd
 		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
 		
 		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false
 		
 		//Dublicates allowded using HashSet<>
 		
 		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
 		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true


		

	}

}

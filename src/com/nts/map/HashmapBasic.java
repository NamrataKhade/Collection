package com.nts.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapBasic {
	public static void main(String args[]) {
		
		//no order-no indexing
		//stores values --key value--<k,v>
		//key can not be dublicate
		//can stores n number of values but only one null key
		//hashmap is not thread-safe-unsynchronized
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		
		//add
		
		hashMap.put("India", "New Delhi");
		hashMap.put("UK", "London");
		hashMap.put("USA", "Washington");
		hashMap.put(null, "Germany");
		hashMap.put(null, "Germany11");
		hashMap.put("Russia", null);
		hashMap.put("Russia1", null);
		
		
		//get
		
		System.out.println(hashMap.get("UK"));
		System.out.println(hashMap.get(null));
		System.out.println(hashMap.get("Russia"));
		System.out.println(hashMap.get("Russia1"));
		System.out.println("--------------------");
		
		//iterator
		Iterator<String> itr = hashMap.keySet().iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			String key = itr.next();
			String value = hashMap.get(key);
			System.out.println("key-- "+key +" "+ "value--- " +value);
		}
		System.out.println("-------------------------");
		
		//iterator over the set(pair) :By using entryset
		Iterator<Entry<String, String>> itr1 = hashMap.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry< String,String> entry = itr1.next();
			System.out.println("Key= "+entry.getKey()+ " " +"Value="+entry.getValue());
			
			 
		}
		System.out.println("--------------------------------------");
		
		//iterator using for each loop-java 8 feature OR lambda
		
		hashMap.forEach((k,v)->System.out.println("Key ="+k+" " +"value ="+v));
		
		

		
		
	}

}

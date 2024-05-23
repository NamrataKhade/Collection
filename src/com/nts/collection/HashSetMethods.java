package com.nts.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
	public static void main(String args[]) {
		
		HashSet<String> h=new HashSet<>();
		h.add("CCC");
		h.add("BBB");
		h.add("AAA");
		h.add("DDD");
		System.out.println(h.add("BBB"));
		System.out.println(h);
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			 System.out.println(itr.next());
			
		}

	}
}

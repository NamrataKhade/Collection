package com.nts.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String args[]) {
		
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("F");
		ls.add("D");
		ls.add("R");
		ls.add("A");
		ls.add("O");
		ls.add("B");
		System.out.println("LinkedHashSet is :"+ls);
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

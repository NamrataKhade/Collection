package com.nts.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethods {
	public static void main(String args[]) {
		
		SortedSet s=new TreeSet();
		
		SortedSet<Integer> headSet1=new TreeSet<Integer>();
		
		s.add(110);
		s.add(111);
		s.add(100);
		s.add(101);
		s.add(108);
		s.add(151);
		s.add(108);
		System.out.println(s);
		
		
		
		
		Object first = s.first();
		System.out.println("Return First :"+first);
		
		headSet1=(TreeSet)s.headSet(108);
		
		System.out.println(headSet1);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


		
		
	}

}

package com.nts.String;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseString {
	public static void main(String args[]) {
		TreeSet t = new TreeSet(new myComparator());
		t.add("Java");
		t.add("PHP");
		t.add("MYSql");
		t.add("Python");
		t.add("AWS");
		t.add("Angular");
		System.out.println(t);
		Iterator itr = t.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

class myComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

}

package com.nts.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(100);
		//l.add("aaa");
		l.add(200);
		
		l.add(300);
		l.add(400);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		
//	l.removeAll(l);
//	System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		//l.isEmpty();
		System.out.println(l.isEmpty());
		
		int hashCode = l.hashCode();
		System.out.println(hashCode);

		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		ArrayList ls=new ArrayList();
//		ls.add("aaa");
//		ls.add("bbb");
//		
//		System.out.println(ls);
//		
//		l.addAll(ls);
//		System.out.println(l);
//		
		
	}

}

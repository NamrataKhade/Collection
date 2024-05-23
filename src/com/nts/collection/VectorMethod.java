package com.nts.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMethod {
	public static void main(String args[]) {
		Vector v=new Vector();
		System.out.println(v.capacity());
//		v.addElement(10);
//		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
	//	v.addElement("AAA");
		System.out.println(v.capacity());
		System.out.println(v);
		
		Iterator iterator = v.iterator();
//		while(iterator.hasNext()) {
//			int next = (int) iterator.next();
//			if(next%2==0) {
//				System.out.println(next);
//			}
//			
//			System.out.println("Read Element 1 By 1 :"+iterator.next());
//		}
		
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			Integer  i = (Integer) iterator.next();
			if(i%2==0)
				System.out.println(i);
			else
				iterator.remove();
		}
		System.out.println(v);
		
		System.out.println(iterator.getClass());
		
		System.out.println(iterator.getClass().getName());
	}
	

}

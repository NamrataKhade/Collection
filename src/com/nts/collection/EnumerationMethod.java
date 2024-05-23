package com.nts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationMethod {
	//@SuppressWarnings("unchecked")
	public static void main(String ars[]) {
	    List al=new ArrayList();
	    al.add(10);
	    al.add(11);
	    al.add(12);
	    al.add(13);
	    al.add(14);
	    al.add(15);
	    al.add(20);
	    al.add(30);
	    
	    System.out.println(al);
	    
	    Enumeration e = Collections.enumeration(al);
	   while( e.hasMoreElements()) {
		   Object nextElement = e.nextElement();
		   System.out.println(nextElement);
	   }
	}

}

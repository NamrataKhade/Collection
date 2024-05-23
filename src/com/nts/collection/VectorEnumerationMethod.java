package com.nts.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationMethod {
public static void main(String args[]) {
	Vector Enum=new Vector();
	Enum.add("JAVA");
	Enum.add("PYTHON");
	Enum.add("SQl");
	Enum.add("MONGODB");
	System.out.println(Enum);
	Enumeration elements = Enum.elements();
	while(elements.hasMoreElements()) {
		Object nextElement = elements.nextElement();
		System.out.println(nextElement);
	}
}
}

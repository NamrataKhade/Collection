package com.nts.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareMethod {
	public static void main(String args[]) {

		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);

	}

}

class MyComparator implements Comparator {

	public int  compare(Object obj1,Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
//		if(I1<I2)
//			return +1;
//		else if(I1>I2)
//			return -1;
//		else
//			return 0;
		
	//	return -I1.compareTo(I2); //Decending Order
		
	//	return I1.compareTo(I2); //Default Sorting Order//Accending order
		
		
	//return I2.compareTo(I1); //Decending order
		
	//	return -I2.compareTo(I1); //Accending Order
		
	//	return +1;                //Insertion Order
		
	return -1;                //Reverse Insertion Order
		
	//	return 0;                //only first element will be inserted.
		
	}
}

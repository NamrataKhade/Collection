package com.nts.arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		
		//allocating memory for 5 integers
		int[] x=new int[5];
		
		
		System.out.println("Class Name of Integer Array :"+x.getClass().getName());
		int length = x.length;
		System.out.println("Size of Array : "+length);
		
		//initialize the array
		x[0]=10;
		x[1]=20;
		x[3]=15;
		x[4]=40;
		//x[5]=50;
		//x[6]=25;
		
		//Access element using for loop
		for(int i=0;i<x.length;i++) {
			System.out.println("Element at index :"+i+":"+x[i]);
		}
		
		//Access element using for each loop
		for (int i : x) {
			
		}
		
		boolean[] b=new boolean[10];
		System.out.println(b.getClass().getName());

	}

}

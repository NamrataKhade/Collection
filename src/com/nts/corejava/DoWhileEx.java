package com.nts.corejava;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		
//		int n=1;
//		System.out.println("Enter No to to find Natural number : ");
//		Scanner sc= new Scanner(System.in);
//		n=sc.nextInt();
//		
//		do {
//		
//			System.out.println(n);
//			n++;
//		}while(n<n);
//		
		
		 int i=1,n;
		 
		   
		   Scanner in = new Scanner(System.in);  
		        System.out.print("Input number: ");  
		         n = in.nextInt();
		
		  System.out.println("The first n natural numbers are : "+n);
		  
		  do {
			  System.out.println(i);
			  i++;
		  }while(i<=n);
		
		
	}

}

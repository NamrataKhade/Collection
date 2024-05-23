package com.nts.list;

import java.util.Scanner;

public class DeclareConstantAsPrivate {
	
	//Declare Constant
	private static final  double PRICE=234.67;
	
	public static void main(String[] args) {
		
		int unit;
		double total_bill;
		System.out.println("Enter Number of units :");
		Scanner sc=new Scanner(System.in);
		unit=sc.nextInt();
		total_bill=PRICE*unit;
		System.out.println("The total amount of bill is : "+total_bill);
		
		
		
		
	}

}

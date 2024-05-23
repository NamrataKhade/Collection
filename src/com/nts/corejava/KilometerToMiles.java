package com.nts.corejava;

import java.util.Scanner;

public class KilometerToMiles {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Kilometer : ");
		float k=sc.nextFloat();
		
		//float v=(float) 1.609;
		float m=k/(float)1.609;
		System.out.println("Value of Kilometer to Miles is  : "+m);
	}

}

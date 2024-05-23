package com.nts.corejava;

import java.util.Scanner;

public class CheckInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		boolean b=sc.hasNextInt();
		System.out.println("If TRUE number is Integer else no is other number  =="+b);

//		float a = 20.2f;
//		a++;
//		System.out.println("Increment on float number : " + a);
	}

}

package com.nts.corejava;

import java.util.Scanner;

public class ScannerUse {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cash : ");
		int cash = sc.nextInt();
		
		
		if(cash<10) {
			System.out.println("CanNot Buy Anything");
			System.out.println("Get More cash");
			
		}
		else if(cash >10 && cash<50) {
			System.out.println("Can get 1 Thing");
		}
		else {
			System.out.println("Can get both");
		}
	}

}

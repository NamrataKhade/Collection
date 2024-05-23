package com.nts.corejava;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
		int choice;
		System.out.println("Enter Your Choice ::");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 10:System.out.println("Ten");
		        break;
		case 20:System.out.println("Twenty");
		        break;
		case 30:System.out.println("Thirty");
		        break;
		case 40:System.out.println("Fourty");
		        break;
		default :System.out.println("No one is match !! Default case is running");
		}
		
	}

}

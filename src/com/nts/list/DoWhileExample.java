package com.nts.list;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;
		do {
			System.out.println("input a number :");
			number = sc.nextInt();
			System.out.println("here is your number :");
			System.out.println(number);

		} while (number >= 0);
		System.out.println("The END");
	}
}

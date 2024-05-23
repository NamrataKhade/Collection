package com.nts.corejava;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println("Print Odd Number :");
		for (int i = 1; i <= n; i++) {

			System.out.println(2 * i + 1);

		}
		System.out.println("Print Even Number :");
		for (int i = 1; i <= n; i++) {

			System.out.println(2 * i);
		}
	}

}

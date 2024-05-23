package com.nts.corejava;

import java.util.Scanner;

public class ScannerWithString {
	public static void main(String[] args) {
		System.out.println("Enter Your Name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name + " Have a good day !");

	}
}

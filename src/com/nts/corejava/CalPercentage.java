package com.nts.corejava;

import java.util.Scanner;

public class CalPercentage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks of 1st Student : ");
		int s1=sc.nextInt();
		System.out.println("Enter Marks of 2nd Student : ");
		int s2=sc.nextInt();
		System.out.println("Enter Marks of 3rd Student : ");
		int s3=sc.nextInt();
		System.out.println("Enter Marks of 4th Student : ");
		int s4=sc.nextInt();
		System.out.println("Enter Marks of 5th Student : ");
		int s5=sc.nextInt();
		
		float total=s1+s2+s3+s4+s5;
		System.out.println("TOtal of marks :"+total);
		
		
		//float percentage=total/5;
		float percentage=(total/500)*100;
		
		System.out.println("Percentage of student of 5 subject Marks : "+percentage);
		//System.out.println(s1);
	}

}

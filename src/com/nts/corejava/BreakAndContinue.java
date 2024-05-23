package com.nts.corejava;

public class BreakAndContinue {
	public static void main(String[] args) {
		 
		for(int i=0;i<=5;i++) {
			
			
			if(i==3) {
				System.out.println("Break the loop Using Break Statement ");
				break;
			}
			System.out.println(i);
		}
		
		System.out.println();
		for(int n=0;n<=5;n++) {
			if(n==3) {
				System.out.println("Use Continue");
				continue;
			}
			System.out.println(n);
		}
	}

}

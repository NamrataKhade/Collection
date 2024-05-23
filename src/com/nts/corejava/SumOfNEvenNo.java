package com.nts.corejava;

public class SumOfNEvenNo {
	public static void main(String[] args) {
		
		int n=100,sum=0,i=1;
		while(i<=n) {
			
			//n*(n+1)/2

			//sum=sum+2*i;
			sum=n*(n+1)/2;
			i++;		
						
		}
		System.out.println("Sum of N natural number is : " + sum);
	}
}
		
//		{  
//			int num = 5, i = 1, sum = 0;  
//			//executes until the condition returns true  
//			while(i <= num)  
//			{  
//			//adding the value of i into sum variable  
//			sum = sum + i;  
//			//increments the value of i by 1  
//			i++;  
//			}  
//			//prints the sum   
//			System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
//			}  
//	}

//}

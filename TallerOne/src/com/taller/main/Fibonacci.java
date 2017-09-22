package com.taller.main;

public class Fibonacci {
	
	
		
	public static int[] fibonacci(int nveces){
		
		int[] fibo = new int[nveces];
		
		fibo[0]=1;
		fibo[1]=2;
		
		for (int i=2;i<=nveces-1;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		return fibo;
		
	}
}

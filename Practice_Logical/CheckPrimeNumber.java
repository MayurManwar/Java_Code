package com.Practice_Logical;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		int n = 5;
		int count = 0;
		int i = 1;

		while (n >= i) {
			if (n % i == 0) 
				count++;
				i++;
			
		}
		if (count == 2) 
			System.out.println("its prime");
		else 
			System.out.println(" not prime");
		

	}
}

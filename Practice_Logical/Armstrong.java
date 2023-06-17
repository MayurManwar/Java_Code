package com.Practice_Logical;

public class Armstrong {

	public static void main(String[] args) {

		
		
		int n = 153;
		int arm = 0;
		int temp = n;

		while (n > 0) {

			int a = n % 10;
			arm = arm + a * a * a;
			n=n/10;

		}
		
		if (temp == arm) {

			System.out.println("ma");

		} else {
			System.out.println("hh");
		}
	}

}

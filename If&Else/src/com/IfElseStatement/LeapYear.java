package com.IfElseStatement;

public class LeapYear {

	public void leap(int year) {

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println("leap Year...!");
		}

		else {

			System.out.println("Common year..!");
		}

	}

	public static void main(String[] args) {

		LeapYear mayur = new LeapYear();
		mayur.leap(2020);

	}
	
}

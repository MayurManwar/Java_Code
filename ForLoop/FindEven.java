package com.practice;

public class FindEven {

	void aa(int a) {

		if (a % 2 == 0) {

			System.out.println("  Given number is even");

		}

		else {

			System.out.println(" number is not valid");
		}

	}

	public static void main(String[] args) {

		FindEven bb = new FindEven();
		bb.aa(66);

	}

}

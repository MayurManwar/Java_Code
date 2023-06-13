package com.mayur;

public class TryAndCatch {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException ee) {
			System.out.println("divide by zero");
		}
		System.out.println(5);
		System.out.println(6);

	}

}

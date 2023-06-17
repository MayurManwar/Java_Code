package com.StringProgram;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "nitin";

		String m = "";

		for (int j = s.length() - 1; j >= 0; j--) {

			m = m + s.charAt(j);

		}

		if (s.equals(m)) {
			System.out.println(" its Palindrome");
		} else {
			System.out.println("its not Palindrome");
		}

	}

}
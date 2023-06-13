package PracticeForInterview.copy;

public class ReverseNum {

	public static void main(String[] args) {

		int n = 1234;
		int rev = 0;

		while (n > 0) {

			rev = (rev * 10) + n % 10;

			n = n / 10;
		}

		System.out.println("reverse number>>> " + rev);
	}

}


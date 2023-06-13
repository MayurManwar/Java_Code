package PracticeForInterview.copy;

public class FabonacciExample {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int n = 10;
		int c;

		System.out.println(a );
		System.out.println(b );

	for (int i = 2; i < 10; i++) { // start from 2 because 0 & 1 already printed

			c = a + b;

			System.out.println(c);

			a = b;
			b = c;

		}

	}

}

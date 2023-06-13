package PracticeForInterview.copy;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int rev=0;
		int n=121;
		int temp;
		
		
		temp=n;
		while(n>0) {
		rev=(rev*10)+n%10;
		n=n/10;
			
		}
		if(temp==rev) {
			System.out.println(" number is Palindrome ");
			
		}
		else
			System.out.println(" number is not Palindrome ");

	}

}

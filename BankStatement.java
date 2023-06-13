package PracticeForInterview;

public class BankStatement {
	
	

	static int balance = 5000;

	static void deposit(int amt) {

		balance = balance + amt;
	}

	static void withdraw(int amt) {

		balance = balance - amt;

	}

	static void display() {

		System.out.println("Current Available Balance >>" + balance);
	}

	public static void main(String[] args) {
		deposit(1000);
		withdraw(500);
		display();
	}
}

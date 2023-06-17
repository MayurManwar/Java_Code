package com.Practice_Logical;

public class BankStatement {
	
	

	static int balance = 5000;

	static void deposit(int amt) {

		if(amt>0) {
		
		balance = balance + amt;
		}
		else {
			System.out.println(" you can not Deposit because amount is less than zero");
		}
		
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

package com.IfElseStatement;

public class GetJob {

	
	
	public void salary(int sal){
		
	if(sal>=500000){
		
		System.out.println("Purchasing a Car.....!");
	}
	else{
		
		System.out.println("Purchasing a bike.....!");
	}
	
	
	
	}
	
	public static void main(String[] args) {
		
		
		GetJob mayur= new GetJob();
		
		mayur.salary(700000);
	}
}

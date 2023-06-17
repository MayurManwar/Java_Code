package com.Practice_Logical;

public class CountNumber {
	
	public static void main(String[] args) {
		
		int n=26788934;
		int count=0;
		
		while(n>0){
			
			n=n/10;
			count++;
			
		}
		
		System.out.println("count number>> "+count);
		
	}

}

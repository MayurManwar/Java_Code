package com.StarPattern;

public class leftSideStar {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++){
			
			
			for(int m=4;m>=i;m--){
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			
			System.out.println(" ");
			
		}
		
		
		
	}

}
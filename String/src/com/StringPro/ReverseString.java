package com.StringPro;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Mayur Manwar";
		
		String d=" ";
		
		for(int i=s.length()-1;i>=0;i--){
			
			
		d=d+s.charAt(i);
			
		//	System.out.println(s.charAt(i));
			
		}
		
		System.out.println(d);
			
		}
	}



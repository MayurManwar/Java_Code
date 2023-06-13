package com.Project2;

import java.util.ArrayList;

public class AtLeast5Charactors {
	
	
	
	void m4(){
		
		System.err.println("Only Those Student Having Atleast 5 char");
		
		
		
		StudentInfo g= new StudentInfo();
	
		ArrayList<Student> h=	g.m1();
		
		
		
		ArrayList<Student> d = new ArrayList<Student>();
		
		
		for (Student mayur : h ){
			
			String s =mayur.getName();
			
			if(s.length()>5){
				
				System.out.println(mayur.getName());
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		AtLeast5Charactors ss = new AtLeast5Charactors();
		
		
		ss.m4();
		
		
	}

}

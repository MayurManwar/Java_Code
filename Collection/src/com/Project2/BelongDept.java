package com.Project2;

import java.util.ArrayList;

public class BelongDept {
	
	
	
	void m5(){
		
		System.err.println("Only Those Student Having  Belong Computer & mech");

		StudentInfo a = new StudentInfo();
		ArrayList<Student> mm = a.m1();

		ArrayList<Student> bb = new ArrayList<>();
		for (Student nn : mm) {
			
			if( nn.getDept()=="Computer" ){
				
				
				System.out.println(nn.getDept());
				System.out.println(nn.getName());
				
			}
			else if(nn.getDept()=="Mech"){
				
				
				System.out.println(nn.getDept());
				System.out.println(nn.getName());
				
			}
			
		}
		
		
	}

	
	
}



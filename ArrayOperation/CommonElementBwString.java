package ArrayOperation;

import java.util.HashSet;
import java.util.Set;

public class CommonElementBwString {
	
	public static void main(String[] args) {
		
	
	
	String a[]={"pyton","mayur","java","springBoot","angular"};
	String b[]={"java","mayur","hibernate"};
	
	
	
	for (int i = 0; i < b.length;i++) {   //  i=0=java  0<2
		for (int j = 0; j < a.length; j++) {  //j=0=python 0<4 j=1=
			
			if(a[j]==b[i]){   // b[i]==a[j]  b[0]==a[0]  java==python 
				
				System.out.println(a[j]);
			
			}
			
		}
		
	}
	
	
}
	}


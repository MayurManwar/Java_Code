package com.hashmapEx;

import java.util.HashMap;

public class AddEmployee {

	public static void main(String[] args) {
		
 HashMap<Integer, String> hm = new HashMap<>();
 
 hm.put(1, "rahul");
 hm.put(2, "kadam");
 hm.put(13, "chetan");
 hm.put(4, "Mayur");
 hm.put(5, "Nikita");
		
 for (int mayur : hm.keySet()) {
	 System.out.println(mayur);
	 System.out.println(hm.get(mayur));
	
}
	}

}

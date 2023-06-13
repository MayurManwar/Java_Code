package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Mayur;
import com.dao.SelectQ;


public class SelectQService {
	
	
	
	
	public ArrayList<Mayur> service() throws SQLException{
		
		SelectQ dao = new SelectQ();
		ArrayList<Mayur> mm = dao.select();
		return mm;
		
		
		
	}
	
	
	

}

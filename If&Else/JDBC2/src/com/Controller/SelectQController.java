package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Mayur;
import com.Service.SelectQService;

public class SelectQController {
	
	
	
	ArrayList<Mayur> select() throws SQLException{
		
		SelectQService mm= new SelectQService();
		
		ArrayList<Mayur> mn=	mm.service();
		
		
		return mn;
	}

}

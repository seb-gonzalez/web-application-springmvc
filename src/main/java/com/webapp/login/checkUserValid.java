package com.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class checkUserValid {
	
	public boolean isValid(String username, String pass) {
		if(username.equals("seb") && pass.equals("changeme")) return true;
		else return false;
	}
}

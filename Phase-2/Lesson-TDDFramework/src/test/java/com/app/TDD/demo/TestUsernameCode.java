package com.app.TDD.demo;

public class TestUsernameCode {
public boolean isvalidUsername(String username) {
		
		if(username.contains("/") || (username.contains("#")))
		{
			return false;
		}
		else if(username.contains("123")){
			return true;
		}
		else
		return true;
	
}	
}

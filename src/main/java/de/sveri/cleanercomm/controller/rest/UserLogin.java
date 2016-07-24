package de.sveri.cleanercomm.controller.rest;

import lombok.Data;

@Data
public class UserLogin {
	
    private String name;
    private String password;
    
    public UserLogin(){}
    
	public UserLogin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

    
}

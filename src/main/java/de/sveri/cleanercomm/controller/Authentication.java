package de.sveri.cleanercomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class Authentication {
	
	@RequestMapping("/login")
	public String home(){
		return "login/login";
	}

}

package de.sveri.cleanercomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Admin {
	
	@RequestMapping("/admin")
	public String index(){
		return "admin/index";
	}

}

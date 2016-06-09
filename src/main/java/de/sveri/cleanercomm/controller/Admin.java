package de.sveri.cleanercomm.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Admin {

	@Secured("Admin")
	@RequestMapping("/admin")
	public String index(){
		return "admin/index";
	}

}

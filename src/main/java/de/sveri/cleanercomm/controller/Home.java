package de.sveri.cleanercomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String home(){
		return "home/index";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "home/about";
	}

	@RequestMapping("/dataprivacypolicy")
	public String dpp() {
		return "home/dataprivacypolicy";
	}

}

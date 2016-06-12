package de.sveri.cleanercomm.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HistoryApi {
	
	@RequestMapping("/test")
	public @ResponseBody Test getTest(){
		Test test = new Test();
		test.setS("iatern");
		return test;
	}
	
	

}

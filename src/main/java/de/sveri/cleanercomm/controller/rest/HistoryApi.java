package de.sveri.cleanercomm.controller.rest;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HistoryApi {
	
	@RequestMapping("/test")
	public @ResponseBody Sample getTest(@RequestHeader(value="Authorization") String authorizationToken){
		Sample test = new Sample();
		test.setS("iatern");
		return test;
	}
	
	

}

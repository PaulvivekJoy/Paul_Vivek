package com.message.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = { "com.message.controller"} )
@RestController
public class MessageController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test() {
		
		return "PaulVivek";
	}

	
}

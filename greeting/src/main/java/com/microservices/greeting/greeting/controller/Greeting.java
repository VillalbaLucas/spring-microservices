package com.microservices.greeting.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    
	@GetMapping("/api/greeting/hello")
	public String greeting(){
		return "hello greeting";
	}
}

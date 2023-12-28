package com.microservices.greeting.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.greeting.greeting.client.FeignClientUser;
import com.microservices.greeting.greeting.dto.UserDto;


@RestController
public class Greeting {

	@Autowired
	private FeignClientUser clientUser;
    
	@GetMapping("/api/greeting/hello")
	public String greeting(){
		return "hello greeting";
	}

	@GetMapping("/api/greeting/{idUser}")
	public ResponseEntity<?> sayHiUser(@PathVariable Long idUser) {
		UserDto user = clientUser.findUser(idUser);
		return ResponseEntity.ok().body(user);
	}
	
}

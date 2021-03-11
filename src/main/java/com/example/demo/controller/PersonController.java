package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class PersonController {
		
		@GetMapping("/greeting")
	    public String greeting() {
	        return "Git Spring Boot and Jenkins";
	    }


}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class PersonController {
		
		@RequestMapping("/greeting")
	    public String greeting() {
	        return "Git Spring Boot and Jenkins";
	    }


}

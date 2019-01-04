package com.springboot.beginner.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@RequestMapping("/")
	public String welcome() {
		return "Hello from Spring Boot With Dev Tools";
	}
	
}

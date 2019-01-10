package com.springboot.main.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	
	//inject message from application.properties
	@Value("${welcome.message}")
	private String message = "Chennai";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", message);
		return "index";
	}
}

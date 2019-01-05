package com.springwebmvc.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springwebmvc.basic.bean.Friend;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeSpring() {
		String message = "Hello from Spring MVC";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("msg", message);
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView addMethod() {
		String message = "Add new record!!!!";
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new Friend());
		mv.addObject("addmessage", message);
		mv.setViewName("addpage");
		return mv;
	}
	@RequestMapping("/list")
	public ModelAndView listMethod() {
		String message = "List all records!!!!";
		return new ModelAndView("listpage", "listmessage", message);
	}
	@RequestMapping(value= "/saveFriend", method = RequestMethod.POST )
	public ModelAndView save(@ModelAttribute("command") Friend friend) {
		System.out.println(friend.getFriendName());
		System.out.println(friend.getFriendLocation());
		return new ModelAndView("redirect:/add.spring");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

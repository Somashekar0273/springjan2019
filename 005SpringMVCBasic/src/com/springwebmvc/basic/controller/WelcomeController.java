package com.springwebmvc.basic.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springwebmvc.basic.bean.Friend;
import com.springwebmvc.basic.entity.FriendEntity;
import com.springwebmvc.basic.service.FriendService;

@Controller
public class WelcomeController {
	
	@Autowired
	FriendService friendService;
	
	private static Logger logger = Logger.getLogger(WelcomeController.class);
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeSpring() {
		String message = "Hello from Spring MVC";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("msg", message);
		return mv;
	}
	
	@RequestMapping(value = "/add")
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
		List friend = new ArrayList<FriendEntity>();
		friend = friendService.listAll();
		System.out.println(friend.size());
		ModelAndView mv = new ModelAndView();
		mv.addObject("friends", friend);	
		mv.setViewName("listpage");
		return mv;
		
		
	}
	
	
	@RequestMapping(value= "/saveFriend", method = RequestMethod.POST )
	public ModelAndView save(@ModelAttribute("command") Friend friend) {
		logger.info("Received the value");
		System.out.println(friend.getFriendName());
		System.out.println(friend.getFriendLocation());
		
		friendService.saveFriend(friend);	

		return new ModelAndView("redirect:/list.spring");
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteFriend(@RequestParam("id") int id) {
		System.out.println(id);
		List friendsList =  friendService.deleteFriend(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("friends", friendsList);
		mv.setViewName("listpage");
		return mv;
	}
	
	@RequestMapping(value = "/update" )
	public ModelAndView updateFriend(@RequestParam("id") int id) {
		FriendEntity fe = friendService.getFriendById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", fe);
		mv.setViewName("addpage");
		
		return mv;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

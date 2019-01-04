package com.sPring.basics.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFriend {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Friend f = (Friend) ctx.getBean("hellofriend");
		//Friend f = new Friend();
		System.out.println(f.getFullname() + " " + f.getAge());
	
	}

}

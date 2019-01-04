package com.spring.multiple.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.multiple.pojo.City;
import com.spring.multiple.pojo.Friend;

public class MainMultipleBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("settings.xml");
		
		Friend f1 = (Friend) ctx.getBean("friendBean");
		Friend f2 = (Friend) ctx.getBean("friendBean");
		
		f1.setName("Prafful Daga");
		
		//City c = (City) ctx.getBean("cityBean");
		
		System.out.println(f1.getName());
		System.out.println("_-----------------_");
		System.out.println(f2.getName());
		
		ctx.registerShutdownHook();
		
		
		
		
		
		
		
			
	}

}

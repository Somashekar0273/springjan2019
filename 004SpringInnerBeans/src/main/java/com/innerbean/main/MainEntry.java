package com.innerbean.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.innerbean.pojo.Blog;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Blog blog = (Blog) ctx.getBean("blogBean");
		System.out.println(blog.getTitle());
		
		blog.displayGalleryInBlog();
				
		
	}

}

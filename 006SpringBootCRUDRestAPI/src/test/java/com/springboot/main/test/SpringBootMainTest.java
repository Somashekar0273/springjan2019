package com.springboot.main.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.springboot.main.service.ProductService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringBootMainTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ProductService productService;
	
	@Test
	public void contextLoads() throws Exception{
		
		Mockito.when(productService.getAllProducts())
				.thenReturn(Collections.emptyList());
	
		MvcResult mvcResult  = (MvcResult) mockMvc.perform(
				MockMvcRequestBuilders.get("/api/v1/get")
								.accept(MediaType.APPLICATION_JSON))
								.andExpect(status().isOk())
								.andReturn();
					
		Mockito.verify(productService).getAllProducts();
		
		
	}

}

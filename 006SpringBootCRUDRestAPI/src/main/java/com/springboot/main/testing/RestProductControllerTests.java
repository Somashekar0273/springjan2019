package com.springboot.main.testing;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.springboot.main.pojo.Product;




@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class RestProductControllerTests {
	@LocalServerPort
	int randomPort;
	@Test
	public void test_getAllProducts() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:"+ randomPort + "/api/v1/get";
		URI uri = new URI(url);
		ResponseEntity<String>  stringresponse = restTemplate.getForEntity(uri, String.class);
		//Asserts
		assertEquals(200, stringresponse.getStatusCodeValue()); 
	}
	
	@Test
	public void test_addProduct() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:"+ randomPort + "/api/v1/add";
		URI uri = new URI(url);
		
		Product p = new Product();
		//p.setId((Integer) null);
		p.setName("Test Name");
		p.setPrice((long) 0.0);
		p.setCategoryid(0);
		
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Product> productRequest = new HttpEntity<>(p, headers);
		
		ResponseEntity<String> responseString = restTemplate.postForEntity(uri, productRequest, String.class);
		
		assertEquals(200, responseString.getStatusCodeValue()); 
		System.out.println(responseString.getBody().toString());
		assertEquals(true , responseString.getBody().contains("Test Name"));  
		
	}
	

}

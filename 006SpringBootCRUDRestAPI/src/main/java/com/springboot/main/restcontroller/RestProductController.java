package com.springboot.main.restcontroller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.entity.ProductEntity;
import com.springboot.main.exception.ResourceNotFoundException;
import com.springboot.main.pojo.Product;
import com.springboot.main.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class RestProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Product REST API Version 1.0";
	}	
	
	@RequestMapping("/welcome/about")
	public String about() {
		return "About Product REST API Version 1.0";
	}	
	
	@RequestMapping(value = "/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<ProductEntity> addProduct(@Valid @RequestBody Product p) {
		return productService.addProduct(p);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable("id") int myid) throws ResourceNotFoundException {
	 Product p  = productService.getProductById(myid).orElseThrow(()-> new ResourceNotFoundException("Product not found: + " + myid));
	 return ResponseEntity.ok().body(p);
			
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List getAllProducts() {
		return productService.getAllProducts();
	}
	
	@RequestMapping(value="update/{id}", method=RequestMethod.POST)
	public List updateProduct(@PathVariable("id") int myid, @RequestBody Product p ) {
		return productService.updateProduct(myid, p);
	}
	
	@RequestMapping(value="/del/{id}", method=RequestMethod.DELETE)
	public List deleteProduct(@PathVariable("id") int myid) {
		return productService.deleteProduct(myid);
	}
		
	
	

}

package com.springboot.main.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	
	private int id;
	
	@NotNull (message="Product name should not be missing or empty")
	@Size(min=4,message="Enter valid product name")
	private String name;
	@NotNull(message="Price should not be left blank")
	@Min(value=0)
	private long price;
	
	private int categoryid;

	
	
	
	
}

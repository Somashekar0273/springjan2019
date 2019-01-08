package com.springboot.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;
import com.springboot.main.repository.ProductRepository;

@Repository("productDao")
public class ProductDAO {
	
	@Autowired
	ProductRepository productRepository;

	public List<ProductEntity> addProduct(Product p) {
		// TODO Auto-generated method stub
		ProductEntity pe = new ProductEntity();
		pe.setName(p.getName());
		pe.setPrice(p.getPrice());
		pe.setCategoryid(p.getCategoryid());
				
		productRepository.saveAndFlush(pe);
		return productRepository.findAll();
		
		
		
		
	}

}

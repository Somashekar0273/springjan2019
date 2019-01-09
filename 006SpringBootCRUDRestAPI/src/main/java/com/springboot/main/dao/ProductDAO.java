package com.springboot.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;
import com.springboot.main.repository.ProductRepository;
import com.springboot.main.service.ProductService;

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
	
	//get product by id
	public Product getProductById(int id) {
		ProductEntity pe = productRepository.findById(id).get();
		Product p = new Product();
		p.setId(pe.getId());
		p.setName(pe.getName());
		p.setCategoryid(pe.getCategoryid());
		p.setPrice(pe.getPrice());
		return p;
	}
	
	//get all products
	public List getAllProducts(){
		
	
		
		return productRepository.findAll();
	}

	public List updateProduct(int myid, Product p) {
		// TODO Auto-generated method stub
		ProductEntity pe = new ProductEntity();
		pe.setId(myid);
		pe.setName(p.getName());
		pe.setCategoryid(p.getCategoryid());
		pe.setPrice(p.getPrice());
		
		productRepository.saveAndFlush(pe);
		return productRepository.findAll();
	}

	public List deleteProduct(int myid) {
		// TODO Auto-generated method stub
		productRepository.deleteById(myid);
		
		return productRepository.findAll();
	}

}

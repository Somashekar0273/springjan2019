package com.springboot.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springboot.main.dao.ProductDAO;
import com.springboot.main.entity.ProductEntity;
import com.springboot.main.pojo.Product;

@Service("productService")
public class ProductService {
	
	@Autowired
	ProductDAO productDao;

	@Transactional
	public List<ProductEntity> addProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.addProduct(p);
	}
	
	@Transactional
	@Cacheable("product")
	public Product getProductById(int id) {
		try {
			System.out.println("Sleep for 8 seconds to simulate call to DB");
			Thread.sleep(8000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return productDao.getProductById(id);
	}

	public List getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	public List updateProduct(int myid, Product p) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(myid, p);
	}

	public List deleteProduct(int myid) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(myid);
	}

}

package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDaoImplement;
import com.cg.entity.Product;

@Service
public class ProductServiceImplement implements ProductServiceI{

	
	@Autowired
	ProductDaoImplement productDao;
	
	@Override
	public void create(Product p) {
		productDao.create(p);
		
	}

	@Override
	public List retrive() {
		return productDao.retrive();
	}

	@Override
	public Product byId(int id) {
		return productDao.byId(id);
	}

	@Override
	public void delete(int id) {

		productDao.delete(id);
	}

	
}

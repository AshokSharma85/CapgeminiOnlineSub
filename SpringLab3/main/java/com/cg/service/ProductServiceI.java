package com.cg.service;

import java.util.List;

import com.cg.entity.Product;

public interface ProductServiceI {

	public void create(Product p);
	public List retrive();
	public Product byId(int id);
	public void delete(int id);
}

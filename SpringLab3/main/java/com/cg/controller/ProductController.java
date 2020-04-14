package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceImplement;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImplement prods;

	@PostMapping(value="/product/add",consumes= {"application/json"})
	public String addStudent(@RequestBody Product p)
	{
		prods.create(p);
		return "Product Added";
	}
	
	
	@GetMapping(value="/productList")
	public List<Product> fetchStudent()
	{
		return prods.retrive();
	}
	
	@GetMapping(value="/product/{id}")
	public Product fetchOne(@PathVariable int id)
	{
		return prods.byId(id);
	}
	
	@DeleteMapping(value="/product/delete/{id}")
	public String delProduct(@PathVariable int id)
	{
		prods.delete(id);
		return "Product has been Deleted";
		
	}
}

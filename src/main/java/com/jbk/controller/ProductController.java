package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.service.impl.ProductServiceImpl;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@PostMapping("/save-product")
	public String addProduct(@RequestBody Product product) {
		return null;
	}
	
	@DeleteMapping("delete-product/{id}")
	public String deleteProduct(@PathVariable() long id) {
		return null;
		
	}
	
	@GetMapping("/get-product-by-id")
	public Product getProductById(@RequestParam() long pid) {
		return null;
		
	}
	
	@GetMapping("/get-all-product")
	public List<Product> getAllProduct(){
		return null;
		
	}
}

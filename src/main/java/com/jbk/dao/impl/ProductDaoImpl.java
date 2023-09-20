package com.jbk.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.jbk.dao.ProductDao;
import com.jbk.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	List<Product> list=new ArrayList<>();

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> deleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

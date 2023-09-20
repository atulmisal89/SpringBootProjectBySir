package com.jbk.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.SupplierDao;
import com.jbk.model.Supplier;
import com.jbk.service.SupplierService;
import com.jbk.validation.ObjectValidation;

@Service
public class SupplierServiceImpl implements SupplierService 
{
	
	@Autowired
	private SupplierDao dao;
	
	@Autowired
	private ObjectValidation objectValidation;

	@Override
	public int addSupplier(Supplier supplier)
	{
		
		String supplierId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		supplier.setSupplierId(Long.parseLong(supplierId));
		
		boolean isValidated = objectValidation.validateObject(supplier);
		
		if(isValidated) 
		{
			return dao.addSupplier(supplier); 
		}
		else 
		{
			return 0;
		}
	
	}

	@Override
	public Supplier getSupplierById(long supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> deleteSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier updateSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

}

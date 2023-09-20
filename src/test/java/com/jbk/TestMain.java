package com.jbk;

import com.google.gson.Gson;
import com.jbk.model.Address;
import com.jbk.model.Supplier;

public class TestMain
{

	public static void main(String[] args) 
	{
		Gson gson=new Gson();
		
		Supplier s=new Supplier();
		Address ad=new Address();
		
		s.setSupplierId(123);
		s.setSupplierName("Atul");
		s.setSupplierMobileNumber("8928938945");
		
		ad.setAddressId(123);
		ad.setCity("Pune");
		ad.setDistrict("Pune");
		ad.setState("Maharashtra");
		ad.setPinCode("411061");
		
		s.setSupplierAddress(ad);
		
		System.out.println(gson.toJson(s));

	}

}

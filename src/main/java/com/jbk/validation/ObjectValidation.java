package com.jbk.validation;

import org.springframework.stereotype.Component;

import com.jbk.model.Address;
import com.jbk.model.Product;
import com.jbk.model.Supplier;

@Component
public class ObjectValidation 
{

	public boolean validateObject(Supplier supplier) 
	{
		boolean isValid=true;

		if(supplier.getSupplierName()==null || supplier.getSupplierName().trim().equals(""))
		{
			isValid=false;
		}

		if(supplier.getSupplierMobileNumber()==null ||supplier.getSupplierMobileNumber().length()!=10 )         
		{
			isValid=false;
		}

		//isValid = validateObject(supplier.getSupplierAddress(),supplier);

		return isValid;		
	}


/*
	public static boolean isAlphabetCharacter(String str) 
	{
		String regex = "^[a-zA-Z]+$";
		return str.matches(regex);
	}

	public static boolean isValidPincode(String pincode) 
	{
		String regex = "^[0-9]{1,6}$";
		return pincode.matches(regex);
	}



	public boolean validateObject(Address address,Supplier supplier)
	{
		boolean isValid=true;

		if(!(supplier.getSupplierAddress().getAddressId()>=0) || !(supplier.getSupplierAddress().getAddressId()<= 999))
		{
			isValid=false;
		}

		if (!(isAlphabetCharacter(supplier.getSupplierAddress().getCity()) &&
				isAlphabetCharacter(supplier.getSupplierAddress().getDistrict()) &&
				isAlphabetCharacter(supplier.getSupplierAddress().getState())))
		{
			isValid = false;
		}

		if (!isValidPincode(supplier.getSupplierAddress().getPinCode())) 
		{
			isValid = false;
		}

		return isValid;

	}

*/	

	public boolean validateObject(Product product)
	{
		return false;

	}





}

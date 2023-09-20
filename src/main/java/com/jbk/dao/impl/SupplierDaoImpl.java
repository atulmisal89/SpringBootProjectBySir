package com.jbk.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.jbk.dao.SupplierDao;
import com.jbk.model.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao 
{

	List<Supplier> list = new ArrayList<>();

	private int checkExistence(Supplier supplier)
	{
		boolean nameExists = false;
		boolean mobileNumberExists = false;

		for (Supplier ele : list)
		{
			if (supplier.getSupplierName().equalsIgnoreCase(ele.getSupplierName())) 
			{
				nameExists = true;
			}

			if (supplier.getSupplierMobileNumber().equals(ele.getSupplierMobileNumber()))
			{
				mobileNumberExists = true;
			}

			// If both conditions are true, no need to continue iterating
			if (nameExists && mobileNumberExists) 
			{
				break;
			}
		}

		if (!nameExists && !mobileNumberExists)
		{
			return 0; // Neither name nor mobile number exists
		}

		else

			if (nameExists && !mobileNumberExists)
			{
				return 1; // Only name exists
			} 

			else

				if (!nameExists && mobileNumberExists) 
				{
					return 2; // Only mobile number exists
				}
				else 
				{
					return 3; // Both name and mobile number exist
				}
	}

    @Override
    public int addSupplier(Supplier supplier)
    {
    	int existenceStatus = checkExistence(supplier);

    	if (existenceStatus == 0) 
    	{
    		list.add(supplier);
    		return 0;
    	} 
    	else
    		if (existenceStatus == 1)
    		{
    			return 1; // Name exists
    		}
    		else
    			if (existenceStatus == 2) 
    			{
    				return 2; // Mobile number exists
    			}
    			else 
    			{
    				return 3; // Both name and mobile number exist
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
	public List<Supplier> deleteSupplier(long supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

}

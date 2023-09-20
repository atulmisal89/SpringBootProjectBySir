package com.jbk.exceptions;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	
	           //Handle Supplier name & mobile no exceptions
	@ExceptionHandler(MethodArgumentNotValidException.class)
   public Map<String,Object> methodArgumentNotValidException(MethodArgumentNotValidException ex)
   {
		Map<String, Object> errorMap=new HashMap<>();
		
		List<FieldError> fe = ex.getFieldErrors();
		
		for(FieldError ele:fe)
		{
			errorMap.put(ele.getField(), ele.getDefaultMessage());
		}

	   return errorMap;
	   
   }
	
	              //fOr Supplier already exists
	              //status:409 Conflict
	@ExceptionHandler(SupplierAlreadyExistsException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public Map<String,Object> SupplierAlreadyExistsException(SupplierAlreadyExistsException ex)
	{
		Map<String, Object> errorMap=new HashMap<>();
		
		errorMap.put("Timestamp", new Date());
		errorMap.put("Default Message",ex.getMessage());
		
		return errorMap;		
	}
}

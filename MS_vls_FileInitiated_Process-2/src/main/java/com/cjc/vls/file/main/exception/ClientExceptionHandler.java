package com.cjc.vls.file.main.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ClientExceptionHandler 
{
	@ExceptionHandler({DocumentidNotFound.class})
	public ExceptionResponse enquiryNotFound(DocumentidNotFound eq,HttpServletRequest request)
	{
			ExceptionResponse e=new ExceptionResponse(eq.getMessage(),request.getRequestURI(),HttpStatus.NOT_FOUND);
			return e;
	}
}

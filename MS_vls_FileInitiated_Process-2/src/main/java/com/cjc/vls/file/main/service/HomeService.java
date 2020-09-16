package com.cjc.vls.file.main.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.vls.file.main.model.Customer;

public interface HomeService 
{

	public String saveDocumetDetails(MultipartFile[] files) throws IOException;

	public void updateDocumentDetails(MultipartFile[] files) throws IOException;

	public List<Customer> getDocumentDetails();

	public void deleteDocumentDetails(int documentid);

	public List<Customer> getDocumentDetails(int documentid);
	
}

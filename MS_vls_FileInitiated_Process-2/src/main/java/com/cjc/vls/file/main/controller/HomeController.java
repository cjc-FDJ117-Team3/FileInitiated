package com.cjc.vls.file.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.vls.file.main.exception.DocumentidNotFound;
import com.cjc.vls.file.main.model.Customer;
import com.cjc.vls.file.main.service.HomeService;

@RestController
@CrossOrigin("*")
@RequestMapping("image")
public class HomeController 
{
	@Autowired
	HomeService hs;
	@RequestMapping(value = "/imagesend",method =RequestMethod.POST)
	public String m1(@RequestPart("imageData")MultipartFile[] files) throws IOException 
	{
		for(MultipartFile file:files) 
		{
			System.out.println(file.getOriginalFilename());
		}
			
			hs.saveDocumetDetails(files);
			return "Data inserted Successfully";
	}
	
	//get All documents
	
		@RequestMapping(value = "/allDocumentDetails",method = RequestMethod.GET)
		public List<Customer> getData()
		{
			return hs.getDocumentDetails();
		}
		
		//get Documents by id
		
		@RequestMapping(value = "/getDocumentDetails/{documentid}", method = RequestMethod.GET)
		public List<Customer> getDocumentDetails(@PathVariable("documentid") int documentid)
		{
			List<Customer> ddl=hs.getDocumentDetails(documentid);
			if(ddl.isEmpty()) 
			{
				String str="Document Details are not present";
				return null;
			}
			else 
			{
				return ddl;
			}		
		}

		// delete Documents by id
		
		@RequestMapping(value = "/deleteDocumentDetails/{documentid}",method = RequestMethod.DELETE)
	     public ResponseEntity deleteDocument(@PathVariable ("documentid") int documentid) 
		{
			hs.deleteDocumentDetails(documentid);
			Customer cust=new Customer();
			List<Customer> list=hs.getDocumentDetails();
			boolean flag=false;
			for(Customer cst: list)
			{
				System.out.println(cst.getDocumentid());
				if(documentid==cst.getDocumentid())
				{
					System.out.println("if loop in for loop");
					flag=true;
					
				}
			}
		    if(flag==false)
			 {
		    	return new ResponseEntity("Record Deleted Successfully",HttpStatus.OK);
		    	
			 }
			else 
			{
				throw new DocumentidNotFound("Not Found");
			}
	     }
		
		//update Documents
		
		@RequestMapping(value = "/updateDocumentDetails",method = RequestMethod.PUT)
		public String updateDocumentDetails(@RequestPart("imageData")MultipartFile[] files)throws IOException {
		hs.updateDocumentDetails(files);	
		return "Record updated Successfully";	
		}
		
}

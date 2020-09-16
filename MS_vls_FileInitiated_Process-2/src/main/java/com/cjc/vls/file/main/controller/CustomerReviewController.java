package com.cjc.vls.file.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vls.file.main.model.CustomerReview;
import com.cjc.vls.file.main.service.CustomerReviewServiceI;

@CrossOrigin("*")
@RestController
public class CustomerReviewController {

	@Autowired
	public CustomerReviewServiceI si; 

@RequestMapping("/getdatabyid1/{id}")
	public CustomerReview getdtl(@PathVariable("id") int id)
	{

		CustomerReview s=si.get(id);
		//System.out.println(i);
		return s;
	}

	
	@RequestMapping("/get1")
	public CustomerReview get()
	{

	
		CustomerReview cr=new CustomerReview();
		cr.setReviewId(1);
		cr.setCustomerId("1");
		cr.setDateReview("30/08/2020");		
		cr.setRemark("Good");
		cr.setRemarkByCM("proper");
		cr.setStatus("ok");
		return cr;
		
	}
	
	@RequestMapping(value="/delete1/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id)
	{
 
		si.deleteCustomerReview(id);
		return "Deleted";
	
	}

	@PutMapping("/update1")
	public String update(@RequestBody CustomerReview s)
	{
	
		
		si.saveCustomerReview(s);
		return "Updated";
	}


	
	@RequestMapping("/getalldata1")
	public Iterable<CustomerReview> insert()
	{

		Iterable<CustomerReview> i=si.getDataCustomerReview();
		System.out.println(i);
		return i;
	}


	

	@RequestMapping(value="/post1",method = RequestMethod.POST)
	public String insert(@RequestBody CustomerReview cr)
	{
		si.saveCustomerReview(cr);
		return "Inserted";
	}

	
}

package com.cjc.vls.file.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vls.file.main.model.CustomerDetail;
import com.cjc.vls.file.main.model.CustomerReview;
import com.cjc.vls.file.main.service.CustomerDetailServiceI;


@CrossOrigin("*")
@RestController
public class CustomerDetailController {

	@Autowired
	public CustomerDetailServiceI si; 

@RequestMapping("/getdatabyid2/{id}")
	public CustomerDetail getdtl(@PathVariable("id") int id)
	{

		CustomerDetail s=si.get(id);
		//System.out.println(i);
		return s;
	}

	
	@RequestMapping("/get2")
	public CustomerDetail get()
	{

	
		CustomerDetail cd=new CustomerDetail();
		cd.setCustomerDetailId(1);
		cd.setCustomerType("Salaried");
		cd.setCustomerUID("1");
		cd.setCustomerSID("1");
		cd.setCustomerDob("14/05/1988");
		cd.setCustomerEmailid("chetan@gmail.com");
		cd.setCustomerGender("male");
		cd.setCustomerLocalAddress("Nagar");
		cd.setCustomerMobileno("7020694917");
		cd.setCustomerId("1");
		cd.setCustomerPermanentAddress("Nagar");
		cd.setCustomerTotalFamilyMember("4");
		cd.setCustomerDependentEarningmember("3");
		cd.setStatus("ok");
		
		return cd;
		
	}
	
	@RequestMapping(value="/delete2/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id)
	{
 
		si.deleteCustomerDetail(id);
		return "Deleted";
	
	}

	@PutMapping("/update2")
	public String update(@RequestBody CustomerDetail s)
	{
	
		
		si.saveCustomerDetail(s);
		return "Updated";
	}


	
	@RequestMapping("/getalldata2")
	public Iterable<CustomerDetail> insert()
	{

		Iterable<CustomerDetail> i=si.getDataCustomerDetail();
		System.out.println(i);
		return i;
	}


	

	@RequestMapping("/post2")
	public String insert(@RequestBody CustomerDetail cr)
	{
		si.saveCustomerDetail(cr);
		return "Inserted";
	}

	
}

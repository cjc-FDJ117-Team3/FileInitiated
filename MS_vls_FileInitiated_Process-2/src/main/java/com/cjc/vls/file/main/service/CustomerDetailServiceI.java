package com.cjc.vls.file.main.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.model.CustomerDetail;
import com.cjc.vls.file.main.model.CustomerReview;




public interface CustomerDetailServiceI {

	public void saveCustomerDetail(CustomerDetail cr);
	public CustomerDetail get(int id);	
	public void deleteCustomerDetail(int id);

	public Iterable<CustomerDetail> getDataCustomerDetail();
	

	
}

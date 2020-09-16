package com.cjc.vls.file.main.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.cjc.vls.file.main.model.CustomerReview;




public interface CustomerReviewServiceI {

	public void saveCustomerReview(CustomerReview cr);
	public CustomerReview get(int id);	
	public void deleteCustomerReview(int id);

	public Iterable<CustomerReview> getDataCustomerReview();
	

	
}

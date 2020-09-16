package com.cjc.vls.file.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import com.cjc.vls.file.main.model.CustomerReview;
import com.cjc.vls.file.main.repository.CustomerReviewRepository;
import com.cjc.vls.file.main.service.CustomerReviewServiceI;




@Service
public class CustomerReviewServiceImplementation implements CustomerReviewServiceI {
	
@Autowired
CustomerReviewRepository crr;

@Override
	public CustomerReview get(int id) {
		// TODO Auto-generated method stub
	 CustomerReview custdtl = crr.findById(id).get();
	 return custdtl;
	}

@Override
	public void saveCustomerReview(CustomerReview cr) {
		// TODO Auto-generated method stub
	crr.save(cr);	
	}

@Override
	public void deleteCustomerReview(int id) {
		// TODO Auto-generated method stub
		crr.deleteById(id);
	}

@Override
	public Iterable<CustomerReview> getDataCustomerReview() {
		// TODO Auto-generated method stub
	Iterable<CustomerReview> custrev=crr.findAll();
	return custrev;
	}

}

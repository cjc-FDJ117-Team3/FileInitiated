package com.cjc.vls.file.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.model.CustomerDetail;

import com.cjc.vls.file.main.model.CustomerReview;
import com.cjc.vls.file.main.repository.CustomerDetailRepository;
import com.cjc.vls.file.main.repository.CustomerReviewRepository;
import com.cjc.vls.file.main.service.CustomerDetailServiceI;
import com.cjc.vls.file.main.service.CustomerReviewServiceI;




@Service
public class CustomerDetailServiceImplementation implements CustomerDetailServiceI {
	
@Autowired
CustomerDetailRepository crr;

@Override
	public CustomerDetail get(int id) {
		// TODO Auto-generated method stub
	 CustomerDetail custdtl = crr.findById(id).get();
	 return custdtl;
	}

@Override
	public void saveCustomerDetail(CustomerDetail cr) {
		// TODO Auto-generated method stub
	crr.save(cr);	
	}

@Override
	public void deleteCustomerDetail(int id) {
		// TODO Auto-generated method stub
		crr.deleteById(id);
	}

@Override
	public Iterable<CustomerDetail> getDataCustomerDetail() {
		// TODO Auto-generated method stub
	Iterable<CustomerDetail> custrev=crr.findAll();
	return custrev;
	}

}

package com.cjc.vls.file.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.repository.PreviousLoanRepository;
import com.cjc.vls.file.main.model.Vls_Customer_Previous_Loan_Details;
import com.cjc.vls.file.main.service.PreviousLoanService;

@Service
public class PreviousLoanServiceImpl implements  PreviousLoanService{

	@Autowired
	PreviousLoanRepository plr;

	@Override
	public void save(Vls_Customer_Previous_Loan_Details pld) {
		plr.save(pld);
	
	}

	@Override
	public Iterable<Vls_Customer_Previous_Loan_Details> getAlldata() {
		Iterable<Vls_Customer_Previous_Loan_Details> list=plr.findAll();
		return list;
	}

	@Override
	public void deleteRecord(int preLoanId) {
		plr.deleteById(preLoanId);
		
	}

	@Override
	public Optional<Vls_Customer_Previous_Loan_Details> editRecord(int preLoanId) {
		Optional<Vls_Customer_Previous_Loan_Details> pld=plr.findById(preLoanId);
		return pld;
	}
	
	

}

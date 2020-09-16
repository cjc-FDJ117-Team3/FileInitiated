package com.cjc.vls.file.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.repository.PreviousLoanAmountRepository;
import com.cjc.vls.file.main.model.Vls_Customer_Pre_Loan_Amount_Details;
import com.cjc.vls.file.main.service.PreviousLoanAmountService;

@Service
public class PreviousLoanAmountServiceImpl implements PreviousLoanAmountService {

	@Autowired
	PreviousLoanAmountRepository plar;
	

	@Override
	public void save(Vls_Customer_Pre_Loan_Amount_Details pla) {
		System.out.println(pla);
		plar.save(pla);
		
	}

	@Override
	public Iterable<Vls_Customer_Pre_Loan_Amount_Details> getAlldata() {
		Iterable<Vls_Customer_Pre_Loan_Amount_Details> list=plar.findAll();
		return list;
	}

	@Override
	public void deleteRecord(int loanamtId) {
		plar.deleteById(loanamtId);
		
	}

	@Override
	public Optional<Vls_Customer_Pre_Loan_Amount_Details> editRecord(int loanamtId) {
		
		Optional<Vls_Customer_Pre_Loan_Amount_Details> plad=plar.findById(loanamtId);
		return plad;
	}

	

	
}

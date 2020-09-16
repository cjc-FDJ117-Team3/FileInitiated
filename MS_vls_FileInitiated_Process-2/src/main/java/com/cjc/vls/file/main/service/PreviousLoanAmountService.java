package com.cjc.vls.file.main.service;

import java.util.Optional;

import com.cjc.vls.file.main.model.Vls_Customer_Pre_Loan_Amount_Details;

public interface PreviousLoanAmountService {

	public void save(Vls_Customer_Pre_Loan_Amount_Details pla);
	

	public Iterable<Vls_Customer_Pre_Loan_Amount_Details> getAlldata();
	
	public void deleteRecord(int loanamtId);
	
	public Optional<Vls_Customer_Pre_Loan_Amount_Details> editRecord(int loanamtId);
	
	
	
	
}

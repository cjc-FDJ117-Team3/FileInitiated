package com.cjc.vls.file.main.service;


import java.util.Optional;
import com.cjc.vls.file.main.model.Vls_Customer_Previous_Loan_Details;

public interface PreviousLoanService {
	

	
	public void save(Vls_Customer_Previous_Loan_Details pld);
	
	public Iterable<Vls_Customer_Previous_Loan_Details> getAlldata();
	

	public void deleteRecord(int preLoanId);
	
	public Optional<Vls_Customer_Previous_Loan_Details> editRecord(int preLoanId);

}

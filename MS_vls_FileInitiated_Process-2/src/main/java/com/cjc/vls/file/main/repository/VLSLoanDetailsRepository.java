package com.cjc.vls.file.main.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.LoanDetails;
import com.cjc.vls.file.main.model.VehicleDetails;


@Repository
public interface VLSLoanDetailsRepository extends CrudRepository<LoanDetails , Integer> {

	//public void save(VehicleDetails v);

	

	public LoanDetails getLaonDetailsByLoanId(int loanId);
	
	public LoanDetails findByloanId(int loanId);



	//public void deleteLoanDetailsByLoanId(int loanId);

	

}

package com.cjc.vls.file.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.model.LoanDetails;
import com.cjc.vls.file.main.model.SanctionLetter;
import com.cjc.vls.file.main.model.VehicleDetails;



public interface VLSServeice {

	
//------------------------loan details------------
	
	public void saveLoan(LoanDetails l);
	


	public List<LoanDetails> getLaonDetails();

	public LoanDetails getLaonDetailsByLoanId(int loanId);

	public List<LoanDetails>  deleteLoanDetailsByLoanId(int loanId);

	public LoanDetails updateLoanDetailsByLoanId(int loanId);
	
	//------------------------vehicle details--------------------
	public void saveVehicle(VehicleDetails v);

	public Iterable<VehicleDetails> getVehicledDetails();

	public List<VehicleDetails> updatevehicledetailsbyid(int vehicleid);

	public List<VehicleDetails> deletevhicledetailsbyid(int vehicleid);

	//------------------------Sanction letter --------------------

	public List<SanctionLetter> savedataSanctionLttr(SanctionLetter s);



	public List<SanctionLetter> getAllData();



	public List<SanctionLetter> getDataBySLId(int sactionLetterId);


	

	

	
	
	
}

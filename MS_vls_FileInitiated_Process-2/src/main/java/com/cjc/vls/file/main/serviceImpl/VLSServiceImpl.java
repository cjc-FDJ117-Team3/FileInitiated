package com.cjc.vls.file.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.model.LoanDetails;
import com.cjc.vls.file.main.model.SanctionLetter;
import com.cjc.vls.file.main.model.VehicleDetails;
import com.cjc.vls.file.main.modeldummy.CDRepo;
import com.cjc.vls.file.main.repository.SanctionLetterRepository;
import com.cjc.vls.file.main.repository.VLSLoanDetailsRepository;
import com.cjc.vls.file.main.repository.VLSVehicleDetailsRepository;
import com.cjc.vls.file.main.service.VLSServeice;




@Service
public class VLSServiceImpl implements VLSServeice{
	
	
	//----------------loan details--------
       @Autowired
       VLSLoanDetailsRepository vlrepo;
       
//       @Autowired
//       CDRepo cd;
		@Override
		public void saveLoan(LoanDetails l) {
			// TODO Auto-generated method stub
			
			//cd.save(l.getCustomerId());
			
			vlrepo.save(l);
			

		}

		@Override
		public List<LoanDetails> getLaonDetails() {
			// TODO Auto-generated method stub
			
			return (List<LoanDetails>) vlrepo.findAll();
		}

		

		@Override
		public LoanDetails getLaonDetailsByLoanId(int loanId) {
			// TODO Auto-generated method stub
			return vlrepo.getLaonDetailsByLoanId(loanId);
		}

		@Override
		public List<LoanDetails> deleteLoanDetailsByLoanId(int loanId) {
			// TODO Auto-generated method stub
			vlrepo.deleteById(loanId);
			return (List<LoanDetails>) vlrepo.findAll();
		}

		@Override
		public LoanDetails updateLoanDetailsByLoanId(int loanId) {
			// TODO Auto-generated method stub
			return vlrepo.findByloanId(loanId);
		}

		
		//-------------------------------VehicleDetailsService-----------------
				@Autowired
				VLSVehicleDetailsRepository vvrepo;

				@Override
				public void saveVehicle(VehicleDetails v) {
					// TODO Auto-generated method stub
					vvrepo.save(v);
				}
		@Override
		public Iterable<VehicleDetails> getVehicledDetails() {
			// TODO Auto-generated method stub
			return vvrepo.findAll();
		}

		@Override
		public List<VehicleDetails> updatevehicledetailsbyid(int vehicleid) {
			// TODO Auto-generated method stub
			return vvrepo.findByvehicleid(vehicleid);
		}

		@Override
		public List<VehicleDetails> deletevhicledetailsbyid(int vehicleid) {
			// TODO Auto-generated method stub
			 vvrepo.deleteById(vehicleid);
			return (List<VehicleDetails>) vvrepo.findAll();
		}

		//-------------------------------Sanction Letter-----------------
		
		@Autowired
		SanctionLetterRepository slrepo;
		
		@Override
		public List<SanctionLetter> savedataSanctionLttr(SanctionLetter s) {
			// TODO Auto-generated method stub
			slrepo.save(s);
			return  slrepo.findAll() ;
		}

		@Override
		public List<SanctionLetter> getAllData() {
			// TODO Auto-generated method stub
			return slrepo.findAll();
		}

		@Override
		public List<SanctionLetter> getDataBySLId(int sactionLetterId) {
			// TODO Auto-generated method stub
			return slrepo.findSactionLetterBySactionLetterId(sactionLetterId);
		}

		

		

		

		
	
	}
	
	



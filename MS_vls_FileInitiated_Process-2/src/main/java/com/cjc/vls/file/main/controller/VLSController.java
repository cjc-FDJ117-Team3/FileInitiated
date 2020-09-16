package com.cjc.vls.file.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vls.file.main.model.LoanDetails;
import com.cjc.vls.file.main.model.SanctionLetter;
import com.cjc.vls.file.main.model.VehicleDetails;
import com.cjc.vls.file.main.service.VLSServeice;



@RestController
@CrossOrigin("http://localhost:4200")
public class VLSController {
	
	 @Autowired
	 VLSServeice vser;
	 
		//----------------------------------Loan Details---------------------------------------------
	 
	@PostMapping("/laondetails")
	public List<LoanDetails> laondetails(@RequestBody LoanDetails l )
	{
		
		double totaleAmmount=l.getTotalAmmount();
		
		//l.setDownpayment(l.getTotalAmmount()*0.6);
		double downPayment=l.getDownpayment();
		double principal=totaleAmmount-downPayment;
		 
		    l.setLoanAmount(principal);
		// double principal =l.getLoanAmount() ;      
		    
	        double rate =l.getRateOfInterest() ;
	              
	        double time =l.getTenure() ;
	       int emi=(int) l.getEmi();
	        
	        
	        rate=rate/(12*100); 
	 
	        time=time*12; 
	            
	       emi = (int) ((principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1));
	      
	        System.out.print(" EMI is= "+emi+"\n");
	              l.setEmi(emi);
	            
	              l.setAdvanceEMI(l.getEmi());
	              
	              l.setTotalInterest(l.getRateOfInterest()*l.getLoanAmount());
	              l.setActualEMI(l.getEmi()+(l.getTotalInterest()/time));
	              
	              System.out.println("AEI  "+l.getActualEMI());
	              
	              System.out.println(l.getTotalInterest());
	              l.setLoanAmountWithIntrest((int) (principal+l.getTotalInterest()));
	              System.out.println(l.getLoanAmountWithIntrest());
	              
	              l.setInsurance((int) (l.getLoanAmount()*(1.1/100)));
	              System.out.println(l.getInsurance());
	              
	              l.setProcessingFees(l.getLoanAmount()*(0.75/100));
	              if(l.getProcessingFees()>=50) {
	              l.setProcessingFees(l.getLoanAmount()*(0.75/100));
	              }{
	            	  l.setProcessingFees(50);
	              }
	              System.out.println(l.getProcessingFees());
	              
	              
	              
	              
		vser.saveLoan(l);
		
		List<LoanDetails> getl=vser.getLaonDetails();
		return getl;
		
		
	}
	
	
	@RequestMapping("/getlaondetails")
	public List<LoanDetails> getlaondetails()
	{
		List<LoanDetails> getl=vser.getLaonDetails();
		return getl;
	}
	
	@RequestMapping("/getlaondetailsbyloanId/{loanId}")
	public LoanDetails getlaondetailsbyloanId(@PathVariable ("loanId") int loanId)
	{
		System.out.println("in  by id loan"+loanId);
		
		LoanDetails getl= vser.getLaonDetailsByLoanId(loanId);
		System.out.println(getl.getLoanId());
		return getl;
	}
	
//	@PutMapping("/updatelaondetailsbyid/{loanId}")
//	public LoanDetails getlaondetailsByLoanId(@PathVariable("loanId") int loanId)
//	{
//		
//		LoanDetails getl=vser.getLaonDetailsByLoanId(loanId);
//		System.out.println(getl.getActualEMI());
//		return getl;
//	}
	
	@PutMapping("/updatelaondetailsbyid")
	public List<LoanDetails> getlaondetailsByLoanId(@RequestBody LoanDetails l)
	{
		
		//LoanDetails l=vser.getLaonDetailsByLoanId(loanId);
		
		System.out.println(l.getActualEMI());
		
		double totaleAmmount=l.getTotalAmmount();
		double downPayment=l.getDownpayment();
		double principal=totaleAmmount-downPayment;
		 
		    l.setLoanAmount(principal);
		// double principal =l.getLoanAmount() ;      
		    
	        double rate =l.getRateOfInterest() ;
	              
	        double time =l.getTenure() ;
	       int emi=(int) l.getEmi();
	        
	        
	        rate=rate/(12*100); 
	 
	        time=time*12; 
	            
	       emi = (int) ((principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1));
	      
	        System.out.print(" EMI is= "+emi+"\n");
	              l.setEmi(emi);
	            
	              l.setAdvanceEMI(l.getEmi());
	              
	              l.setTotalInterest(l.getRateOfInterest()*l.getLoanAmount());
	              l.setActualEMI(l.getEmi()+(l.getTotalInterest()/time));
	              
	              System.out.println("AEI  "+l.getActualEMI());
	              
	              System.out.println(l.getTotalInterest());
	              l.setLoanAmountWithIntrest((int) (principal+l.getTotalInterest()));
	              System.out.println(l.getLoanAmountWithIntrest());
	              l.setInsurance((int) (l.getLoanAmount()*(1.1/100)));
	              System.out.println(l.getInsurance());
	              l.setProcessingFees(l.getLoanAmount()*(0.75/100));
	              System.out.println(l.getProcessingFees());
	              
	              
	              
	              
		vser.saveLoan(l);
		
		List<LoanDetails> l1=vser.getLaonDetails();
		
		return l1;
	}
	
	
	@DeleteMapping("/deletelaondetailsbyid/{loanId}")
	public List<LoanDetails> deletelaondetailsByLoanId(@PathVariable("loanId") int loanId)
	{
		
		vser.deleteLoanDetailsByLoanId(loanId);
		
		List<LoanDetails> getl=vser.getLaonDetails();
		return getl;
	}
	
//	@RequestMapping(value="updatelaondetailsbyid/{loadId}")
//	public LoanDetails updaetlaondetailsByLoanId(@PathVariable("loanId") int loanId)
//	{
//		System.out.println(loanId);
//		LoanDetails getl=vser.updateLoanDetailsByLoanId(loanId);
//		
//		
//		return getl;
//	}
	
	//----------------------------------Vehicles Details---------------------------------------------
	@PostMapping("/vehicledetails")
	public String vehicledetails(@RequestBody VehicleDetails v )
	{
		
		vser.saveVehicle(v);
		
		return "vihicle Details Registered to Database";
		
		
	}
	
	@RequestMapping("/getvehicledetails")
	public Iterable<VehicleDetails> getvehicledetails()
	{
		System.out.println("IN VEHDETAILS");
		Iterable<VehicleDetails> getV=vser.getVehicledDetails();
		return getV;
	}
	
	
	@RequestMapping("/updatevehicledetailsbyid/{vehicleid}")
	public List<VehicleDetails> updatevehicledetailsbyid(@PathVariable("vehicleid") int vehicleid)
	{
		List<VehicleDetails> getl=vser.updatevehicledetailsbyid(vehicleid);
		return getl;
	}
	
	
	
	@RequestMapping("/deletevhicledetailsbyid/{vehicleid}")
	public List<VehicleDetails> deletevhicledetailsbyid(@PathVariable("vehicleid") int vehicleid)
	{
		List<VehicleDetails> getl=	vser.deletevhicledetailsbyid(vehicleid);
		
		
		return getl;
	}
	
	//----------------------------------------------------Sanction Letter-----------------------------
	
	@Autowired
	VLSServeice hs;
	
	@RequestMapping(value="/regSanctionL",method = RequestMethod.POST)
	public List<SanctionLetter> Insertdata(@RequestBody com.cjc.vls.file.main.model.SanctionLetter s)
	{
		
		hs.savedataSanctionLttr(s);
		
		List<SanctionLetter> al=hs.getAllData();
		return al;
	}

}






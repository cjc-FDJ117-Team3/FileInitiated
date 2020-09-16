package com.cjc.vls.file.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.vls.file.main.model.Vls_Customer_Previous_Loan_Details;
import com.cjc.vls.file.main.serviceImpl.PreviousLoanServiceImpl;

@CrossOrigin("*")
@RestController
public class PreviousLoanController {
	
	@Autowired
	PreviousLoanServiceImpl plsi;
	
	@PostMapping("/register")
	public String SaveLoanDetails(@RequestBody Vls_Customer_Previous_Loan_Details pld)
	{
		System.out.println(pld);
		plsi.save(pld);
		return "inserted successfully";
	}
	
	@GetMapping("/getAllData")
	public Iterable<Vls_Customer_Previous_Loan_Details> getalldata()
	{
		Iterable<Vls_Customer_Previous_Loan_Details> list=plsi.getAlldata();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="/delete/{preLoanId}" ,method=RequestMethod.DELETE)
	public void deleteLoanDetails(@PathVariable("preLoanId")int preLoanId)
	{
		plsi.deleteRecord(preLoanId);
	}
	
	@RequestMapping(value="/edit/{preLoanId}" ,method=RequestMethod.GET)
	public Optional<Vls_Customer_Previous_Loan_Details> editData(@PathVariable("preLoanId")int preLoanId)
	{
		Optional<Vls_Customer_Previous_Loan_Details> pld=plsi.editRecord(preLoanId);
		return pld;
	}
	
	@RequestMapping(value="/update" ,method=RequestMethod.PUT)
	public String updateRecord(@RequestBody Vls_Customer_Previous_Loan_Details pld)
	{
		plsi.save(pld);
		return "updated successfully";
		
	}



}

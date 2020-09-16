package com.cjc.vls.file.main.controller;

import java.util.List;
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

import com.cjc.vls.file.main.model.Vls_Customer_Pre_Loan_Amount_Details;
import com.cjc.vls.file.main.serviceImpl.PreviousLoanAmountServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/preloan")
public class PreviousLoanAmountController {
	
	@Autowired
	PreviousLoanAmountServiceImpl plsi;
	
	
	@PostMapping("/register1")
	public String SaveLoanDetails(@RequestBody Vls_Customer_Pre_Loan_Amount_Details plad)
	{
		System.out.println(plad);
		plsi.save(plad);
		return "inserted successfully";
	}
	
	@GetMapping("/getAllData1")
	public List<Vls_Customer_Pre_Loan_Amount_Details> getAllData()
	{
		List<Vls_Customer_Pre_Loan_Amount_Details> list=(List<Vls_Customer_Pre_Loan_Amount_Details>) plsi.getAlldata();
		return list;
	}
	
	@RequestMapping(value="/delete1/{loanamtId}" ,method=RequestMethod.DELETE)
	public void deleteLoanDetails(@PathVariable("loanamtId")int loanamtId)
	{
		plsi.deleteRecord(loanamtId);
	}
	
	@RequestMapping(value="/edit1/{loanamtId}" ,method=RequestMethod.GET)
	public Optional<Vls_Customer_Pre_Loan_Amount_Details> editData(@PathVariable("loanamtId")int loanamtId)
	{
		Optional<Vls_Customer_Pre_Loan_Amount_Details> plad=plsi.editRecord(loanamtId);
		return plad;
	}
	
	@RequestMapping(value="/update1" ,method=RequestMethod.PUT)
	public String updateRecord(@RequestBody Vls_Customer_Pre_Loan_Amount_Details plad)
	{
		plsi.save(plad);
		return "updated successfully";
		
	}


}

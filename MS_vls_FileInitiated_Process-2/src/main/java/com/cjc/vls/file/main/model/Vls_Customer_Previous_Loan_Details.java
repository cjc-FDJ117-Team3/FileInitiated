package com.cjc.vls.file.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vls_Customer_Previous_Loan_Details {
	
	@Id
	private int preLoanId;
	@OneToOne(cascade = CascadeType.ALL)
	private Vls_CustomerDetails customerDetailId;
	private double loanAmount;
	private String loanCatagory;
	
	public Vls_Customer_Previous_Loan_Details()
	{
		super();
	}

	public Vls_Customer_Previous_Loan_Details(int preLoanId, Vls_CustomerDetails customerDetailId, double loanAmount,
			String loanCatagory) {
		super();
		this.preLoanId = preLoanId;
		this.customerDetailId = customerDetailId;
		this.loanAmount = loanAmount;
		this.loanCatagory = loanCatagory;
	}

	public int getPreLoanId() {
		return preLoanId;
	}

	public void setPreLoanId(int preLoanId) {
		this.preLoanId = preLoanId;
	}

	public Vls_CustomerDetails getCustomerDetailId() {
		return customerDetailId;
	}

	public void setCustomerDetailId(Vls_CustomerDetails customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanCatagory() {
		return loanCatagory;
	}

	public void setLoanCatagory(String loanCatagory) {
		this.loanCatagory = loanCatagory;
	}

	@Override
	public String toString() {
		return "Vls_Customer_Previous_Loan_Details [preLoanId=" + preLoanId + ", customerDetailId=" + customerDetailId
				+ ", loanAmount=" + loanAmount + ", loanCatagory=" + loanCatagory + "]";
	}
	
	
	
	
}
